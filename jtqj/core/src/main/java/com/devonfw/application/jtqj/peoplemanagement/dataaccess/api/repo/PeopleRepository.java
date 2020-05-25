package com.devonfw.application.jtqj.peoplemanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.jtqj.peoplemanagement.dataaccess.api.PeopleEntity;
import com.devonfw.application.jtqj.peoplemanagement.logic.api.to.PeopleSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link PeopleEntity}
 */
public interface PeopleRepository extends DefaultRepository<PeopleEntity> {

  /**
   * @param criteria the {@link PeopleSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link PeopleEntity} objects that matched the search. If no pageable is set, it
   *         will return a unique page with all the objects that matched the search.
   */
  default Page<PeopleEntity> findByCriteria(PeopleSearchCriteriaTo criteria) {

    PeopleEntity alias = newDslAlias();
    JPAQuery<PeopleEntity> query = newDslQuery(alias);

    String people_name = criteria.getPeople_name();
    if (people_name != null && !people_name.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getPeople_name()), people_name, criteria.getPeople_nameOption());
    }
    if (criteria.getPageable() == null) {
      criteria.setPageable(PageRequest.of(0, Integer.MAX_VALUE));
    } else {
      addOrderBy(query, alias, criteria.getPageable().getSort());
    }

    return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
  }

  /**
   * Add sorting to the given query on the given alias
   * 
   * @param query to add sorting to
   * @param alias to retrieve columns from for sorting
   * @param sort specification of sorting
   */
  public default void addOrderBy(JPAQuery<PeopleEntity> query, PeopleEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "people_name":
            if (next.isAscending()) {
              query.orderBy($(alias.getPeople_name()).asc());
            } else {
              query.orderBy($(alias.getPeople_name()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}