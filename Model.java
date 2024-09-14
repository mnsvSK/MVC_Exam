import java.util.ArrayList;

public class Model {
    public ArrayList<Cow> cow_inFarmList;
    double sumVolume; //นมทั้งหมด
    double milkVolume; //นมรายตัว
    Farm farm;
    public Model() {
         farm = new Farm();
        cow_inFarmList = farm.getCowList();
        sum_milkVolume();
    }
    
    public double getSumVolume() {
        return sumVolume;
    }

    public double getMilkVolume() {
        return milkVolume;
    }

    //เช็คว่าเป็นรหัสที่มีอยู่ในฟาร์ม
    public String cowCodeCheck(int cowCode){
        for (Cow cow : cow_inFarmList) {
            if (cow.getCowCode() == cowCode) {
                Cow_MilkCal(cowCode);
                return "Cow status :Code "+cowCode+"is available\n";
            }
        }
        return "Cow status :Code "+cowCode+"is not here\n";
    }

    //คำนวณปริมาณนมของวัวรายตัว
    public void Cow_MilkCal(int cowCode){
        milkVolume = 0;
        Cow cow = farm.getCow(cowCode);
        if (cow.getCowBreed().equals("White")) {
            milkVolume = fresh_MilkCal(cow.getCowAgeYear(),cow.getCowAgeMonth());
        }
        else if(cow.getCowBreed().equals("Brown")){
            milkVolume = choco_MilkCal(cow.getCowAgeYear(),cow.getCowAgeMonth());
        }
        else if(cow.getCowBreed().equals("Pink")){
            milkVolume = strawberry_MilkCal(cow.getCowAgeYear(),cow.getCowAgeMonth());
        }
        
    }

    //คำนวณปริมาณนมทั้งหมด
    public void sum_milkVolume(){
        sumVolume = 0;
        for (Cow cow : cow_inFarmList) {
            if (cow.getCowBreed().equals("White")) {
                sumVolume += fresh_MilkCal(cow.getCowAgeYear(),cow.getCowAgeMonth());
            }
            else if(cow.getCowBreed().equals("Brown")){
                sumVolume += choco_MilkCal(cow.getCowAgeYear(),cow.getCowAgeMonth());
            }
            else if(cow.getCowBreed().equals("Pink")){
                sumVolume += strawberry_MilkCal(cow.getCowAgeYear(),cow.getCowAgeMonth());
            }
        }
    }

    //คำนวณปริมาณนมรสจืด
    public double fresh_MilkCal(int ageYear,int ageMonth){
        double volume = 120-(ageYear*12 + ageMonth);
        return volume;
    }
    //คำนวณปริมาณนมรสช็อกโกแลต
    public double choco_MilkCal(int ageYear,int ageMonth){
        double volume = 40-ageYear;
        return volume;
    }
    //คำนวณปริมาณนมรสสตรอว์เบอร์รี่
    public double strawberry_MilkCal(int ageYear,int ageMonth){
        double volume = 30-ageMonth;
        return volume;
    }

    //เก็บข้อมูลวัวทั้งหมดในฟาร์ม
    class Farm {
        public ArrayList<Cow> cow_inFarmList = new ArrayList<>();
        Farm(){
            cow_inFarmList.add(new Cow(53672458, "White", 2, 10));
            cow_inFarmList.add(new Cow(23412561, "White", 4, 0));
            cow_inFarmList.add(new Cow(14723512, "White", 3, 7));
            cow_inFarmList.add(new Cow(12342563, "White", 6, 4));
            cow_inFarmList.add(new Cow(12342135, "Brown", 8, 0));
            cow_inFarmList.add(new Cow(56345632, "Brown", 0, 3));
            cow_inFarmList.add(new Cow(63785426, "Brown", 7, 4));
            cow_inFarmList.add(new Cow(36475924, "Brown", 9, 11));
            cow_inFarmList.add(new Cow(36452972, "Brown", 1, 5));
            cow_inFarmList.add(new Cow(45624576, "Brown", 2, 3));
            cow_inFarmList.add(new Cow(12345624, "Pink", 3, 4));
            cow_inFarmList.add(new Cow(42256753, "Pink", 4, 5));
            cow_inFarmList.add(new Cow(33542675, "Pink", 6, 6));
            cow_inFarmList.add(new Cow(24596782, "Pink", 0, 3));
            cow_inFarmList.add(new Cow(67589542, "Pink", 0, 11));
        }
        
        public ArrayList<Cow> getCowList() {
            return cow_inFarmList;
        }
        public void setCowList(ArrayList<Cow> cowList) {
            this.cow_inFarmList = cowList;
        }
        //return cow จากรหัส
        public Cow getCow(int cowCode){
            for (Cow cow : cow_inFarmList) {
                if (cow.getCowCode() == cowCode){
                    return cow;
                }
            }
            return null;
        }
    
    }

}
