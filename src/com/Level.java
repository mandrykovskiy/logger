package com;


public enum Level {
    NAME("1"), TYPE("2"), LOCATION("3");
    private String buttonNumber;

    Level(String buttonNumber) {
        this.buttonNumber = buttonNumber;
    }

    public String getButtonNumber() {
        return buttonNumber;
    }

//    Scanner sc= new Scanner(System.in);
//    String text=sc.next();
//        System.out.println(Level.valueOf(text).getButtonNumber());
//

//        Map<String, String> menu = new HashMap();
//        menu.put("1", "Hello");
//        menu.put("2", "Hello1");
//        menu.put("3", "Hello3");
//        String command=sc.nextLine();
//        System.out.println(menu.get(command));


}
