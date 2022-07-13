package ss10_dsa_list.practice.simple_list_class.controller;

import ss10_dsa_list.practice.simple_list_class.model.MyList;

public class MyListController   {
        public static void main(String[] args) {
                MyList<Integer> listInteger = new MyList<Integer>();
                listInteger.add(1);
                listInteger.add(2);
                listInteger.add(3);
                listInteger.add(3);
                listInteger.add(5);

                System.out.println("element 3: "+listInteger.get(3));
                System.out.println("element 0: "+listInteger.get(0));
                System.out.println("element 4: "+listInteger.get(4));
                System.out.println("element 2: "+listInteger.get(2));
        }

}
