class EmployeeMain
{
  public static void main(String[] args)
  {
      Employee e= new Employee();
      e.setName("Ravi");
      e.setAddress("Pune");
      e.setMobile("9998887771");
      System.out.println("Employee Details ");
       System.out.println("Name : " + e.getName());
       System.out.println("Address : " + e.getAddress());
       System.out.println("Mobile : " + e.getMobile());
  }

}