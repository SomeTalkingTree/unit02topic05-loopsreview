public class Main {

//don't know how to test
  public static String formGradeString(int[] start){
    String grade= "" ;   
    for(int num: start){
      if (start[num]>89){
        grade+='A';
      }else if(start[num]>79){
        grade+='B';
      }else if(start[num]>69){
        grade+='C';
      }else if(start[num]>59){
        grade+='D';
      }else{
        grade+='F';
      }
    }
    return grade;
  }
  //that


  public static String valedictorianName(String[] names, double[] GPA){
    int number = 0;
    double high = 0;
    for(int num = 0;num < GPA.length;num++){
      if (high<GPA[num]){
        high = GPA[num];
        number = num;
      }
    }
    return names[number];

  }




  public static void main(String[] args) {
    int[] nums = new int[54];
    nums[0] = 62;
    nums[1] = 79; //62, 79, 99, 50
    nums[2] = 99;
    nums[4] = 50;
    System.out.println(formGradeString(nums));
  }
}


//javac Main.java; java Main