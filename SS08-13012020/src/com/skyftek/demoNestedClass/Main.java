package com.skyftek.demoNestedClass;

public class Main {
    public static void main(String[] args) {
        MemberNestedClass member = new MemberNestedClass();
        MemberNestedClass.MyDate date = member.new MyDate();
        date.setDay(13);
        date.setMonth(1);
        date.setYear(2020);

        member.setBirthday(date);
        System.out.println(member.getBirthday());

        String[] arrTemp = "18/06/1989".split("/");
        System.out.println("leng = " + arrTemp.length);
        for(String string : arrTemp){
            System.out.println(string);
        }

        member.returnAward();
        System.out.println(member.getBirthday().day);
        System.out.println(member.getBirthday().month);
        System.out.println(member.getBirthday().year);
    }
}
