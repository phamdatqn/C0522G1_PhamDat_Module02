package services.impl;

import exception.*;
import models.Customer;
import regex.*;
import services.ICustomerService;
import utils.IOCustomerUtil;
import utils.InputPersonUtil;
import utils.InputUtil;

import java.util.LinkedList;
import java.util.List;

public class CustomerService implements ICustomerService {
    List<Customer> customerList = new LinkedList<>();

    private Customer infoCustomer(String idCustomer) {

        String name;
        while (true) {
            try {
                name = InputNameRegex.getNameUtil(InputUtil.getString("Nhập họ và tên Khách hàng: "));
                break;
            } catch (InputNameException e) {
                e.printStackTrace();
            }
        }

        String birthday = InputDayRegex.getBirthDay(InputDayRegex.getBirthDay("Nhập ngày sinh khách hàng: "));

        String gender = InputPersonUtil.inputGenderUtil();

        String idCard;
        while (true) {
            try {
                idCard = InputIdCardRegex.getIdCardRegex(InputUtil.getString("Nhập CMND khách hàng: "));
                break;
            } catch (InputIDCardException e) {
                e.printStackTrace();
            }
        }


        String numberPhone;
        while (true) {
            try {
                numberPhone = InputPhoneNumberRegex.getNumberphoneRegex(InputUtil.getString("Nhập số điện thoại khách hàng: "));
                break;
            } catch (InputNumberPhoneException e) {
                e.printStackTrace();
            }
        }

        String email;
        while (true) {
            try {
                email = InputEmailRegex.getEmail(InputUtil.getString("Nhập vào email khách hàng: "));
                break;
            } catch (InputEmailException e) {
                e.printStackTrace();

            }
        }

        String address;
        while (true) {
            try {
                address = InputAddressRegex.getAddressRegex(InputUtil.getString("Nhập địa chỉ khách hàng: "));
                break;
            } catch (InputAddressException e) {
                e.printStackTrace();
            }
        }


        String customerType = InputPersonUtil.inputTypeCustomerUtil();


        return new Customer(name, birthday, gender, idCard, numberPhone,
                email, address, idCustomer, customerType);
    }


    @Override
    public void add() {
        Customer customer;
        String idCustomer;
        customerList = IOCustomerUtil.readCustomer(IOCustomerUtil.PATH_CUSTOMER);
        while (true) {
            try {
                idCustomer = InputIDCustomerRegex.getIdCustomerRegex(InputUtil.getString("Nhập mã khách hàng mới:"));
                for (Customer item : customerList) {
                    if (item.getIdCustomer().equals(idCustomer)) {
                        throw new DuplicateIDException("Mã nhân viên đã tồn tại!");
                    }
                }
                customer = infoCustomer(idCustomer);
                customerList.add(customer);
                IOCustomerUtil.writeCustomer(IOCustomerUtil.PATH_CUSTOMER, customerList);
                System.out.println("Thêm mới thành công!\n");
                break;
            } catch (DuplicateIDException | InputIDCustomerException e) {
                e.printStackTrace();

            }
        }
    }

    @Override
    public void remove() {

        customerList = IOCustomerUtil.readCustomer(IOCustomerUtil.PATH_CUSTOMER);
        String idRemove = InputUtil.getString("Mời bạn nhập mã khách hàng cần xóa:");
        boolean answer = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomer().equals(idRemove)) {
                int chooseYesNo = InputUtil.getInt("Bạn chắc chắn muốn xóa?\n1. Có" +
                        "\n2. Không");
                if (chooseYesNo == 1) {
                    customerList.remove(i);

                    IOCustomerUtil.writeCustomer(IOCustomerUtil.PATH_CUSTOMER, customerList);
                    System.out.println("đã xóa mã khách hàng " + idRemove + " thành công!");
                }
                answer = true;
                break;
            }
        }
        if (!answer) {
            System.out.println("Không tìm thấy mã khách hàng: " + idRemove);
        }
    }

    @Override
    public void edit() {
        customerList = IOCustomerUtil.readCustomer(IOCustomerUtil.PATH_CUSTOMER);
        String idFind = InputUtil.getString("Mời bạn nhập mã khách hàng cần sửa:");
        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomer().equals(idFind)) {
                System.out.println("\nThông tin khách hàng đang sửa là:\n" + customerList.get(i));

                while (true) {
                    try {
                        customerList.get(i).setName(InputNameRegex.getNameUtil(InputUtil.getString("Nhập tên khách hàng cần mới: ")));
                        break;
                    } catch (InputNameException e) {
                        e.printStackTrace();
                    }
                }

                customerList.get(i).setBirthday(InputDayRegex.getBirthDay("Nhập vào ngày tháng năm sinh khách hàng mới: "));

                customerList.get(i).setGender(InputPersonUtil.inputGenderUtil());

                while (true) {
                    try {
                        String cmnd = InputIdCardRegex.getIdCardRegex(InputUtil.getString("Nhập CMND khách hàng cần sửa:"));
                        for (int j = 0; j < customerList.size(); j++) {
                            if (customerList.get(j).getIdCard().equals(cmnd) && j != i) {
                                throw new DuplicateIDException("Trùng CMND, mời nhập lại!");
                            }
                        }
                        customerList.get(i).setIdCard(cmnd);
                        break;
                    } catch (DuplicateIDException | InputIDCardException e) {
                        e.printStackTrace();
                    }
                }

                while (true) {
                    try {
                        customerList.get(i).setNumberPhone(InputPhoneNumberRegex.getNumberphoneRegex(InputUtil.getString("Nhập số điện thoại khách hàng: ")));
                        break;
                    } catch (InputNumberPhoneException e) {
                        e.printStackTrace();
                    }
                }
                while (true) {
                    try {
                        customerList.get(i).setEmail(InputEmailRegex.getEmail(InputUtil.getString("Nhập email khách hàng: ")));
                        break;
                    } catch (InputEmailException e) {
                        e.printStackTrace();
                    }
                }

                while (true) {
                    try {
                        customerList.get(i).setAddress(InputAddressRegex.getAddressRegex(InputUtil.getString("Nhập địa chỉ cần sửa:")));
                        break;
                    } catch (InputAddressException e) {
                        e.printStackTrace();
                    }
                }


                customerList.get(i).setCustomerType(InputPersonUtil.inputTypeCustomerUtil());
                IOCustomerUtil.writeCustomer(IOCustomerUtil.PATH_CUSTOMER, customerList);
                System.out.println("Cập nhập thành công khách hàng có mã: " + idFind);
                flag = true;
                customerList.clear();
            }
            if (!flag) {
                System.out.println("Không tìm thấy mã khách hàng: " + idFind);
            }
        }
    }

    @Override
    public void findID() {
        customerList = IOCustomerUtil.readCustomer(IOCustomerUtil.PATH_CUSTOMER);
        String idFind = InputUtil.getString("Mời bạn nhập mã khách hàng cần tìm:");
        idFind = idFind.toUpperCase();
        boolean iFlag = false;
        for (Customer customer : customerList) {
            if (customer.getIdCustomer().equals(idFind)) {
                System.out.println("tìm thấy thông tin khách hàng có mã : " + idFind);
                System.out.println(customer);
                iFlag = true;
            }
        }
        if (!iFlag) {
            System.out.println("Không tìm thấy thông tin: " + idFind);
        }

    }

    @Override
    public void findName() {

        customerList = IOCustomerUtil.readCustomer(IOCustomerUtil.PATH_CUSTOMER);
        List<Customer> customers = new LinkedList<>();
        String findName = InputUtil.getString("Mời bạn nhập tên khách hàng cần tìm:");


        findName = findName.toLowerCase();
        boolean isFlag = false;
        for (Customer customer : customerList) {
            if (customer.getName().toLowerCase().contains(findName)) {
                customers.add(customer);
                isFlag = true;
            }
        }
        if (isFlag) {
            System.out.println("Danh sách liên quan đến tên : " + findName);
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }

        if (!isFlag) {
            System.out.println("Không tìm thấy thông tin liên quan đến tên : " + findName);
        }
    }


    @Override
    public void displayAll() {
        System.out.println("Danh sách khách hàng hiện có:");
        List<Customer> customerList = IOCustomerUtil.readCustomer(IOCustomerUtil.PATH_CUSTOMER);
        for (Customer item : customerList) {
            System.out.println(item);
        }
    }
}
