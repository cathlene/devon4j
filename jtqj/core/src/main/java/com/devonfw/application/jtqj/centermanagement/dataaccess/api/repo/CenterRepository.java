package com.devonfw.application.jtqj.centermanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.jtqj.centermanagement.dataaccess.api.CenterEntity;
import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link CenterEntity}
 */
public interface CenterRepository extends DefaultRepository<CenterEntity> {

  /**
   * @param criteria the {@link CenterSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link CenterEntity} objects that matched the search. If no pageable is set, it
   *         will return a unique page with all the objects that matched the search.
   */
  default Page<CenterEntity> findByCriteria(CenterSearchCriteriaTo criteria) {

    CenterEntity alias = newDslAlias();
    JPAQuery<CenterEntity> query = newDslQuery(alias);

    String center_name = criteria.getCenter_name();
    if (center_name != null && !center_name.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getCenter_name()), center_name, criteria.getCenter_nameOption());
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
  public default void addOrderBy(JPAQuery<CenterEntity> query, CenterEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "center_name":
            if (next.isAscending()) {
              query.orderBy($(alias.getCenter_name()).asc());
            } else {
              query.orderBy($(alias.getCenter_name()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}