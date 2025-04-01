
class Device
{
   String deviceID;
   String status;
}
class Thermostat extends Device
{
   int temperature;

   Thermostat()
   {
   	this.deviceID = "KRSL343";
   	this.status = "On";
   	this.temperature = 18;
   }
   void display()
   {
   	System.out.println(deviceID);
   	System.out.println(status);
   	System.out.println(temperature);
   }
}
public class temp
{
   public static void main(String[] args)
   {
   Thermostat author = new Thermostat();
   author.display();
}}

