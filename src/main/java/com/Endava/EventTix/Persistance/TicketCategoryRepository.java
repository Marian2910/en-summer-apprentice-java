package com.Endava.EventTix.Persistance;


import com.Endava.EventTix.Model.TicketCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepository extends CrudRepository<TicketCategory, Integer> {
    TicketCategory findTicketCategoryByTicketCategoryId(Integer id);
}
