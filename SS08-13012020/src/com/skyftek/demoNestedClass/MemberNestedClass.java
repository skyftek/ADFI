package com.skyftek.demoNestedClass;

public class MemberNestedClass {
    private String name;
    private MyDate birthday;

    public MemberNestedClass() {
        birthday = new MyDate();
        birthday.day = 10;
    }

    public void setDefaultName(String name) {
        this.name = name;
    }

    class MyDate {
        int day;
        int month;
        int year;

        public String returnName() {
            setDefaultName("Vietanh");
            return name;
        }

        public MyDate() {
        }

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    // Tao local inner class
    // Tao class trong 1 phuong thuc
    public void returnAward() {
        class Date2 {
            String datetime = "18/06/1989";

            public Date2() {
            }

            public Date2(String datetime){
                this.datetime = datetime;
            }

            // Chuyen du lieu String (18/06/1989) ve kieu doi tuong MyDate
            public MyDate convert(){
                MyDate temp = new MyDate();
                String[] arrTemp = this.datetime.split("/");
                temp.setDay(Integer.parseInt(arrTemp[0]));
                temp.setMonth(Integer.parseInt(arrTemp[1]));
                temp.setYear(Integer.parseInt(arrTemp[2]));
                return temp;
            }
        }
        Date2 date2 = new Date2();
        birthday = date2.convert();
    }
}
