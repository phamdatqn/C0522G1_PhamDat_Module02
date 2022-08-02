package regex.person_regex;

import exception.person.InputIDCustomerException;

public class InputIDCustomerRegex {
    private static final String IDCUSTOMER_REGEX = "^(CU|cu)[-][\\d]{4}$";

    public static String getIdCustomerRegex(String idCustomer) throws InputIDCustomerException {
        if (idCustomer.matches(IDCUSTOMER_REGEX)) {
            return idCustomer;
        } else {
            throw new InputIDCustomerException("LỖI: Mã khách hàng phải bắt đầu bằng chữ CU - 4 mã số! ");
        }
    }
}
