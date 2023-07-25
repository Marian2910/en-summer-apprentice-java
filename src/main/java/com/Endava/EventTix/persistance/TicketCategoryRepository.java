package com.Endava.EventTix.persistance;


import com.Endava.EventTix.model.TicketCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepository extends CrudRepository<TicketCategory, Integer> {
    TicketCategory findTicketCategoryByTicketCategoryId(Integer id);
}
