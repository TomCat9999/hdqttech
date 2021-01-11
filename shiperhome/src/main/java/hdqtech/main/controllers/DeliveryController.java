package hdqtech.main.controllers;

import hdqtech.main.entity.Delivery;
import hdqtech.main.services.DeliveryServices;
import hdqtech.main.services.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeliveryController {
    @Autowired
    private DeliveryServices deliveryServices;

    // getAll delivery
    @GetMapping("/delivery")
    public ResponseEntity<ServiceResult> getAllDelivery() {
        return new ResponseEntity<ServiceResult>(deliveryServices.getAll(), HttpStatus.OK);

    }

    //     get All Delivery By Id
    @GetMapping("/delivery/{id}")
    public ResponseEntity<ServiceResult> getAllDeliveryById(@PathVariable int id) {
        return new ResponseEntity<ServiceResult>(deliveryServices.findById(id), HttpStatus.OK);
    }

    //     create delivery
    @PostMapping("/delivery")
    public ResponseEntity<ServiceResult> createDelivery(@RequestBody Delivery delivery) {
        return new ResponseEntity<ServiceResult>(deliveryServices.createDelivery(delivery), HttpStatus.OK);

    }

    //update delivery
    @PutMapping("/delivery")
    public ResponseEntity<ServiceResult> updateDelivery(@RequestBody Delivery delivery) {
        return new ResponseEntity<ServiceResult>(deliveryServices.updateDelivery(delivery), HttpStatus.OK);

    }

    // delete Delivery
    @DeleteMapping("/delivery")
    public ResponseEntity<ServiceResult> deleteDelivery(@RequestBody DeleteDeliveryRequest request) {
        return new ResponseEntity<ServiceResult>(deliveryServices.deleteDelivery(request.getId()), HttpStatus.OK);
    }
}
