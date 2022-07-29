package regex;

import exception.InputAddressException;

public class InputAddressRegex {
    private static final String ADDRESS_REGEX = "([ ]*[a-z]{2,7}[ ]+){1,4}[a-z]{2,7}[ ]*";

    public static String getAddressRegex(String str) throws InputAddressException {
        StringBuilder string = new StringBuilder();
        if (str.matches(ADDRESS_REGEX)) {
            str = str.toLowerCase().trim();
            str = str.replaceAll("[ ]+", " ");
            String[] arrName = str.split(" ");

            for (String s : arrName) {
                string.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
            }
        } else {
            throw new InputAddressException("LỖI: Nhập sai tên Tỉnh ( Thành Phố ), mời nhập lại!!!");
        }
        return string.toString().trim();
    }

//    public static void main(String[] args){
//        Scanner scanner =new Scanner(System.in);
//
//        while (true){
//            try {
//                System.out.println("Nhập tên tỉnh: ");
//                String str2=scanner.nextLine();
//                System.out.println(getAddressRegex(str2));
//                break;
//            }catch (InputAddressException e){
//                e.printStackTrace();
//            }
//        }
//    }
}
