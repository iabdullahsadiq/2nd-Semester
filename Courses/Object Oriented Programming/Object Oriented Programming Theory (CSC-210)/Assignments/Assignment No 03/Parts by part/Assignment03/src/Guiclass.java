/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Guiclass {
   


    private  String AdmissionName;
     private  String RegistrationName;
 public String ToString()
        {
            return "Admissiont={Name=" + AdmissionName + ",Register=" + RegistrationName + "}";
        }
        public void setName(String Name)
        {
            AdmissionName = Name;
        } 
        public String getName()
        {
            return AdmissionName;
        }
        public void setRegistrationName(String Name)
        {
            RegistrationName= Name;
        }
        
        public String GetName(){
        
            return RegistrationName;
        }
}

    

