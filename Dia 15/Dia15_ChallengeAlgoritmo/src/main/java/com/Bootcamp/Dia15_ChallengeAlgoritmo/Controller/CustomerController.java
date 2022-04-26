package com.Bootcamp.Dia15_ChallengeAlgoritmo.Controller;

import com.Bootcamp.Dia15_ChallengeAlgoritmo.Model.CustomerModel;
import com.Bootcamp.Dia15_ChallengeAlgoritmo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
//@Api(value = "Controller Customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping
    public ResponseEntity<ArrayList<CustomerModel>> getAllCostumers() {
        return customerService.getAllCustomers();
    }


    @GetMapping("/customer/{dni}")
    public ResponseEntity<Optional<CustomerModel>> getCustomerByDni(@PathVariable("dni") String dni) {
        if(dni == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        if(dni.length()<=0 ^ dni.length() >8){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return customerService.getCustomerByDni(dni);
    }

    @GetMapping("/{name}")
    public ResponseEntity<ArrayList<CustomerModel>> getCustomersByName(@PathVariable("name") String name) {
        if(name == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return customerService.getCustomersByName(name);
    }

    @PostMapping("/customer")
    public ResponseEntity<CustomerModel> registerCustomer(@RequestBody CustomerModel costumerBody) {
        if(costumerBody.getDni() == null ^ (costumerBody.getDni().length()<=0 ^ costumerBody.getDni().length() >8)){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return customerService.registerCostumer(costumerBody);
    }

    @PutMapping("/customer")
    public ResponseEntity<CustomerModel> modifyCustomer(@RequestBody CustomerModel costumerBody) {
        if(costumerBody.getDni() == null ^ (costumerBody.getDni().length()<=0 ^ costumerBody.getDni().length() >8)){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return customerService.registerCostumer(costumerBody);
    }

    @DeleteMapping("/customer/{dni}")
    public ResponseEntity deleteCustomer(@PathVariable("dni") String dni){
        if(dni == null ^ (dni.length()<=0 ^ dni.length() >8)){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return customerService.deleteCostumerByDni(dni);
    }
}
