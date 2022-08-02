package services.impl.impl_facility;

import exception.facility.InputIDBookingException;
import exception.person.InputIDCustomerException;
import models.model_facility.Booking;
import models.model_facility.House;
import models.model_facility.Room;
import models.model_facility.Villa;
import models.model_person.Customer;
import regex.InputDayRegex;
import regex.facility_regex.InputIdBookingRegex;
import regex.person_regex.InputIDCustomerRegex;
import services.IBookingService;
import utils.InputUtil;
import utils.facility_untils.*;
import utils.person_untils.IOCustomerUtil;

import java.util.*;

public class BookingService implements IBookingService, Comparator<Booking> {
    Set<Booking> bookingTreeSet = new TreeSet<>();

    private Booking infoBooking(String idBooking, String idCustomer,String idFacility) {
        String startDay = InputDayRegex.getBirthDay("Nhập ngày tháng bắt đầu: ");

        String endDay = InputDayRegex.getBirthDay("Nhập ngày tháng kết thúc: ");

        String nameService = InputFacilityUtil.inputNameService();

        return new Booking(idBooking, startDay, endDay, idCustomer, nameService, idFacility);
    }

    @Override
    public void add() {
        bookingTreeSet = IOBookingUtil.readBooking(IOBookingUtil.PATH_BOOKING);
        List<Customer> customerList= IOCustomerUtil.readCustomer(IOCustomerUtil.PATH_CUSTOMER);
        Map<House,Integer> houseIntegerMap= IOHouseUtil.readHouse(IOHouseUtil.PATH_HOUSE);
        Map<Room,Integer> roomIntegerMap= IORoomUtil.readRoom(IORoomUtil.PATH_ROOM);
        Map<Villa,Integer> villaIntegerMap= IOVillaUtil.readVilla(IOVillaUtil.PATH_VILLA);


        Booking booking;

        String idBooking;
        while (true){
            try {
                idBooking= InputIdBookingRegex.getIdHouseRegex(InputUtil.getString("Nhập mã Booking: "));
                for (Booking item: bookingTreeSet){
                   if (item.getIdBooking().equals(idBooking)){
                       throw new InputIDBookingException("Mã Booking "+idBooking+" này đã tồn tại!!!");
                    }
                }
                break;
            }catch (InputIDBookingException e){
                e.printStackTrace();
                System.out.println(" ");
            }
        }

        System.out.println("Danh sách khách hàng hiện có: ");
        for (Customer item: customerList){
            System.out.println("Mã Khách Hàng: "+item.getIdCustomer()+" Họ và Tên: "+item.getName());

        }

        String idCustomer;
        System.out.println("Mời copy mã khách hàng ở trên!");
        while (true){
            try {
                idCustomer =InputIDCustomerRegex.getIdCustomerRegex(InputUtil.getString("Nhập mã Khách hàng: "));
                break;
            } catch (InputIDCustomerException e) {
                e.printStackTrace();
                System.out.println(" ");
            }
        }

        System.out.println("Danh sách dịch vụ House hiện có: ");
        for (House house:houseIntegerMap.keySet()){
            System.out.println(house.getIdFacility());
        }

        System.out.println("Danh sách dịch vụ Room hiện có: ");
        for (Room room:roomIntegerMap.keySet()){
            System.out.println(room.getIdFacility());
        }

        System.out.println("Danh sách dịch vụ Villa hiện có: ");
        for (Villa villa:villaIntegerMap.keySet()){
            System.out.println(villa.getIdFacility());
        }
        String idFacility = InputUtil.getString("nhập mã dịch vụ: ");

        booking=infoBooking(idBooking,idCustomer,idFacility);
        bookingTreeSet.add(booking);
        IOBookingUtil.writeBooking(IOBookingUtil.PATH_BOOKING,bookingTreeSet);
        System.out.println("Đã thêm mới mã Booking "+idBooking+ " thành công!");

        Set<House> houseSet= houseIntegerMap.keySet();
        for (House house: houseSet){
            if (house.getIdFacility().equals(idFacility)){
                houseIntegerMap.put(house,houseIntegerMap.get(house)+1);
                if (houseIntegerMap.get(house)>=5){
                    System.out.println("Mã dịch vụ: "+house.getIdFacility()+
                            " Tên dịch vụ "+house.getNameFacility()+" đã sử  dụng >5 lần cần được bảo trì !!!");
                }break;
            }
        }
        IOHouseUtil.writeHouse(IOHouseUtil.PATH_HOUSE,houseIntegerMap);


        Set<Villa> villaSet= villaIntegerMap.keySet();
        for (Villa villa: villaSet){
            if (villa.getIdFacility().equals(idFacility)){
                villaIntegerMap.put(villa,villaIntegerMap.get(villa)+1);
                if (villaIntegerMap.get(villa)>=5){
                    System.out.println("Mã dịch vụ: "+villa.getIdFacility()+" Tên dịch vụ "+villa.getNameFacility()+" đã sử  dụng >5 lần cần được bảo trì !!!");
                }break;
            }
        }
        IOVillaUtil.writeVilla(IOVillaUtil.PATH_VILLA,villaIntegerMap);

        Set<Room> roomSet= roomIntegerMap.keySet();
        for (Room room: roomSet){
            if (room.getIdFacility().equals(idFacility)){
                roomIntegerMap.put(room,roomIntegerMap.get(room)+1);
                if (roomIntegerMap.get(room)>=5){
                    System.out.println("Mã dịch vụ: "+room.getIdFacility()+" Tên dịch vụ "+room.getNameFacility()+" đã sử  dụng >5 lần cần được bảo trì !!!");
                }break;
            }
        }
        IORoomUtil.writeRoom(IORoomUtil.PATH_ROOM,roomIntegerMap);

    }

    @Override
    public void remove() {
        System.out.println("Chức năng đang trong quá trình hoàn thiện");

    }

    @Override
    public void edit() {
        System.out.println("Chức năng đang trong quá trình hoàn thiện");
    }

    @Override
    public void displayAll() {
        Set<Booking> bookingSet = IOBookingUtil.readBooking(IOBookingUtil.PATH_BOOKING);
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }



    }

    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.getStartDay().compareTo(o2.getIdBooking())>0){
            return 1;
        }return 0;
    }
}
