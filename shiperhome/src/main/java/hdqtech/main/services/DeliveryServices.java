package hdqtech.main.services;

import hdqtech.main.entity.Delivery;
import hdqtech.main.repository.IDelivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServices {
    @Autowired
    IDelivery idelivery;

    public ServiceResult getAll() {
        ServiceResult result = new ServiceResult();
        result.setData(idelivery.findAll());
        return result;
    }

    public ServiceResult findById(int id) {
        ServiceResult result = new ServiceResult();
        Delivery delivery = idelivery.findById(id).orElse(null);
        result.setData(delivery);
        return result;
    }

    public ServiceResult createDelivery(Delivery delivery) {
        ServiceResult result = new ServiceResult();
        result.setData(idelivery.save(delivery));
        return result;
    }
     public ServiceResult updateDelivery(Delivery delivery) {
        ServiceResult result = new ServiceResult();
        if(!idelivery.findById(delivery.getId()).isPresent()){
            result.setStatus(ServiceResult.Status.FAILED);
            result.setMessage("delivery not found!!!");

        }else{
            result.setData(idelivery.save(delivery));

        }
        return result;
    }
    public ServiceResult deleteDelivery(int  id) {
        ServiceResult result = new ServiceResult();
        Delivery delivery = idelivery.findById(id).orElse(null);
        if(delivery==null){
            result.setStatus(ServiceResult.Status.FAILED);
            result.setMessage("Delivery not Found!!!");

        }else{
            idelivery.delete(delivery);
            result.setMessage("success");
        }
        return result;

    }


}
