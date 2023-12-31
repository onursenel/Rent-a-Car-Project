package com.tobeto.spring.b.java.controllers;


import com.tobeto.spring.b.java.services.abstracts.OrderService;
import com.tobeto.spring.b.java.services.dtos.requests.order.AddOrderRequest;
import com.tobeto.spring.b.java.services.dtos.requests.order.UpdateOrderRequest;
import com.tobeto.spring.b.java.services.dtos.responses.order.GetOrderListResponse;
import com.tobeto.spring.b.java.services.dtos.responses.order.GetOrderResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/orders")
public class OrdersController {

    private final OrderService orderService;



    @GetMapping("getAll")
    public List<GetOrderListResponse> getAll(){
        return orderService.getAll();
    }

    @GetMapping("{id}")
    public GetOrderResponse getById(@PathVariable int id){
        return orderService.getById(id);
    }

    @PostMapping
    public void add(@RequestBody @Valid AddOrderRequest addOrderRequest){
        orderService.add(addOrderRequest);
    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateOrderRequest updateOrderRequest,@PathVariable int id){
        orderService.update(updateOrderRequest,id);

    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        orderService.delete(id);
    }

    @GetMapping("searchDate")
    public List<GetOrderListResponse> getByDate(@RequestParam LocalDate date){
        return orderService.getByDate(date);
    }

    @GetMapping("dateOrId")
    public List<GetOrderListResponse> getByDateOrId(@RequestParam LocalDate date,int id){
        return orderService.getByDateOrId(date,id);
    }

    @GetMapping("orderDate")
    public List<GetOrderListResponse> getOrderDate(){
        return orderService.orderDate();
    }


    @GetMapping("JPQLgetAll")
    public List<GetOrderListResponse> getAll2(){
        return orderService.getAll2();
    }





}
