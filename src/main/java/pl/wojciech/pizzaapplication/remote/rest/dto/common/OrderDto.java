package pl.wojciech.pizzaapplication.remote.rest.dto.common;

import pl.wojciech.pizzaapplication.domain.model.OrderStatusType;

import java.util.List;

public class OrderDto {
    private Integer id;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto persons;

    public OrderDto() {
    }

    public OrderDto(Integer id, OrderStatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto persons) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.persons = persons;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPersons() {
        return persons;
    }

    public void setPersons(PersonOrderDto persons) {
        this.persons = persons;
    }
}
