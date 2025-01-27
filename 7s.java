class Student{
    int age;
    String name;
    public Student(){
        this.name="Unknown";
        this.age=0;
        System.out.println("Default Construtur is added and used for this student");
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Student(Student obj){
        this.name=obj.name;
        this.age=obj.age;
    }
    public String getName(){
        return name;
    }
      public int getAge(){
        return age;
    }
}
class koushor{
    public static void main(String[] args){
        Student[] arr=new Student[5];
        arr[0]=new Student();
        arr[1]=new Student("Koushor",21);
        arr[2]=new Student("Utkarsh",20);
        arr[3]=new Student("Sudip",5);
        arr[4]=new Student(arr[3]);
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i].getAge();
        }
        System.out.println("The avg age of the 5 students is : "+(sum/5));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].getName().compareTo(arr[j].getName())>0){
                    String temp=arr[i].getName();
                    arr[i].name=arr[j].getName();
                    arr[j].name=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("The "+(i+1)+" th name in ascending order of name is : "+arr[i].getName());
        }
    }
}