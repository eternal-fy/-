import com.ld.controller.CustomerController;
import com.ld.dao.AdministratorDao;
import com.ld.dao.BillDao;
import com.ld.dao.RoomDao;
import com.ld.pojo.Administrator;
import com.ld.pojo.Bill;
import com.ld.pojo.Customer;
import com.ld.pojo.Room;
import com.ld.service.AdministratorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationcontext.xml"})
public class testR {
    @Autowired
    CustomerController customerController;
    @Autowired
    AdministratorService administratorService;
    @Autowired
    RoomDao roomDao;

    @Autowired
    BillDao billDao;
    @Test
    public void test1() throws SQLException {
       List<Room> rooms =  roomDao.getRooms();
        for (Room room : rooms) {
            System.out.println(room);
        }

    }
    @Test
    public void test2() throws SQLException {
        List<Customer> customers = customerController.getCustomers();
        System.out.println(customers);

    }

    @Test
    public void test3() throws SQLException {
        Administrator ld = new Administrator("ld", 22, 1);
        administratorService.addAdministrator(ld);
        System.out.println(administratorService.getAdministrators());

    }

    @Test
    public void test4() throws SQLException {
        List<Integer> freeRoomids = roomDao.getFreeRooms();
        System.out.println(freeRoomids);

    }

    @Test
    public void test5() throws SQLException {
        List<Bill> bills = billDao.getBills();
        System.out.println(bills);

    }
    @Test
    public void test9() throws SQLException {
        Bill ld = new Bill("123", 1, "ld", 10, 10);
        System.out.println("||||||");
        billDao.addBill(ld);

    }
}
