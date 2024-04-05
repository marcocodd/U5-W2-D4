package marco.U5W2D4.dao;

import marco.U5W2D4.entities.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingService {

    @Autowired
    private ToppingDAO toppingDAO;

    public void save(Topping newTopping) {

        toppingDAO.save(newTopping);
        System.out.println("Topping salvato");
    }
}
