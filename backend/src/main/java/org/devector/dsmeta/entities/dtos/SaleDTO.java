package org.devector.dsmeta.entities.dtos;

import java.time.LocalDate;

public class SaleDTO {

    private Long id;

    private String sallerName;

    private Integer visited;

    private Integer deals;

    private Double amount;

    private LocalDate date;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSallerName() {
        return sallerName;
    }

    public void setSallerName(String sallerName) {
        this.sallerName = sallerName;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
