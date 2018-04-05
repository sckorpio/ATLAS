
/**
 * Write a description of class missionAtlas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class My_Atlas
{
    void main()throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        
        
        String ctr[]={
 "Afghanistan"
,"Albania"
,"Algeria"
,"Andorra"
,"Angola"
,"Antigua and Barbuda"
,"Argentina"
,"Armenia"
,"Australia"
,"Austria"
,"Azerbaijan"
,"Bahamas"
,"Bahrain"
,"Bangladesh"
,"Barbados"
,"Belarus"
,"Belgium"
,"Belize"
,"Benin" 
,"Bhutan"
,"Bolivia" 
,"Bosnia and Herzegovina"
,"Botswana" 
,"Brazil"
,"Brunei" 
,"Bulgaria"
,"Burkina Faso"
,"Burma"
,"Burundi"
,"Cambodia"
,"Cameroon"
,"Canada"
,"Cape Verde"
,"Central African Republic"
,"Chad"
,"Chile"
,"China"
,"Colombia" 
,"Comoros" 
,"Congo(Republic)"
,"Congo(Democratic Republic)"
,"Costa Rica"
,"Côte d'Ivoire"
,"Croatia"
,"Cuba"
,"Cyprus"
,"Czech Republic"
,"Denmark"
,"Djibouti"
,"Dominica"
,"Dominican Republic"
,"Ecuador"
,"Egypt"
,"El Salvador"
,"Equatorial Guinea"
,"Eritrea"
,"Estonia"
,"Ethiopia"
,"Fiji"
,"Finland"
,"France"
,"Gabon"
,"Gambia"
,"Georgia"
,"Germany" 
,"Ghana" 
,"Greece" 
,"Grenada" 
,"Guatemala" 
,"Guinea" 
,"Guinea-Bissau" 
,"Guyana"
,"Haiti" 
,"Holy See" 
,"Honduras"
,"Hungary"
,"Iceland" 
,"India" 
,"Indonesia" 
,"Iran" 
,"Iraq" 
,"Ireland" 
,"Israel" 
,"Italy"
,"Jamaica" 
,"Japan" 
,"Jordan" 
,"Kazakhstan"
,"Kenya" 
,"Kiribati"
,"Korea, North"
,"Korea, South" 
,"Kosovo" 
,"Kuwait" 
,"Kyrgyzstan" 
,"Laos" 
,"Latvia" 
,"Lebanon" 
,"Lesotho"
,"Liberia"
,"Libya" 
,"Liechtenstein"
,"Lithuania" 
,"Luxembourg" 
,"Macedonia" 
,"Madagascar" 
,"Malawi" 
,"Malaysia" 
,"Maldives" 
,"Mali" 
,"Malta" 
,"Marshall Islands" 
,"Mauritania" 
,"Mauritius" 
,"Mexico" 
,"Micronesia"
,"Moldova"
,"Monaco"
,"Mongolia" 
,"Montenegro"
,"Morocco"
,"Mozambique"
,"Namibia "
,"Nauru" 
,"Nepal"
,"Netherlands" 
,"New Zealand" 
,"Nicaragua"
,"Niger"
,"Nigeria"
,"Norway" 
,"Oman"
,"Pakistan" 
,"Palau"
,"Panama"
,"Papua New Guinea" 
,"Paraguay"
,"Peru"
,"Philippines"
,"Poland"
,"Portugal"
,"Qatar"
,"Romania"
,"Russia"
,"Rwanda"
,"Saint Kitts and Nevis"
,"Saint Lucia"
,"Saint Vincent and the Grenadines"
,"Samoa"
,"San Marino"
,"Sao Tome and Principe"
,"Saudi Arabia"
,"Senegal"
,"Serbia"
,"Seychelles"
,"Sierra Leone"
,"Singapore "
,"Slovakia"
,"Slovenia"
,"Solomon Islands"
,"Somalia"
,"South Africa"
,"South Sudan"
,"Spain"
,"Sri Lanka"
,"Sudan"
,"Suriname"
,"Swaziland"
,"Sweden" 
,"Switzerland"
,"Syria"
,"Tajikistan"
,"Tanzania"
,"Thailand"
,"Timor-Leste"
,"Togo"
,"Tonga"
,"Trinidad and Tobago"
,"Tunisia"
,"Turkey"
,"Turkmenistan"
,"Tuvalu"
,"Uganda"
,"Ukraine"
,"United Arab Emirates"
,"United Kingdom"
,"United States"
,"Uruguay"
,"Uzbekistan"
,"Vanuatu"
,"Venezuela"
,"Vietnam"
,"Yemen"
,"Zambia"
,"Zimbabwe"};



String cpt[]={
"Kabul"
,"Tirana"
,"Algiers"
,"Andorra la Vella"
,"Luanda"
,"Saint John's"
,"Buenos Aires"
,"Yerevan"
,"Canberra"
,"Vienna"
,"Baku"
,"Nassau"
,"Manama"
,"Dhaka"
,"Bridgetown"
,"Minsk"
,"Brussels"
,"Belmopan"
,"Porto-Novo"
,"Thimphu"
,"La Paz "
,"Sarajevo"
,"Gaborone"
,"Brasília"
,"Bandar Seri Begawan"
,"Sofia"
,"Ouagadougou"
,"Rangoon"
,"Bujumbura"
,"Phnom Penh"
,"Yaoundé"
,"Ottawa"
,"Praia"
,"Bangui"
,"N'Djamena"
,"Santiago"
,"Beijing"
,"Bogotá"
,"Moroni"
,"Brazzaville"
,"Kinshasa"
,"San José"
,"Yamoussoukro"
,"Zagreb"
,"Havana"
,"Nicosia"
,"Prague"
,"Copenhagen"
,"Djibouti"
,"Roseau"
,"Santo Domingo"
,"Quito"
,"Cairo"
,"San Salvador"
,"Malabo"
,"Asmara"
,"Tallinn"
,"Addis Ababa"
,"Suva"
,"Helsinki"
,"Paris"
,"Libreville"
,"Banjul"
,"Tbilisi"
,"Berlin"
,"Accra"
,"Athens"
,"Saint George's"
,"Guatemala"
,"Conakry"
,"Bissau"
,"Georgetown"
,"Port-au-Prince"
,"Vatican City"
,"Tegucigalpa"
,"Budapest"
,"Reykjavík"
,"New Delhi"
,"Jakarta"
,"Tehran"
,"Baghdad"
,"Dublin"
,"Jerusalem "
,"Rome"
,"Kingston"
,"Tokyo"
,"Amman"
,"Astana"
,"Nairobi"
,"Tarawa"
,"Pyongyang"
,"Seoul"
,"Pristina"
,"Kuwait"
,"Bishkek"
,"Vientiane"
,"Riga"
,"Beirut"
,"Maseru"
,"Monrovia"
,"Tripoli"
,"Vaduz"
,"Vilnius"
,"Luxembourg"
,"Skopje"
,"Antananarivo"
,"Lilongwe"
,"Kuala Lumpur"
,"Male"
,"Bamako"
,"Valletta"
,"Majuro"
,"Nouakchott"
,"Port Louis"
,"Mexico"
,"Palikir"
,"Chisinau"
,"Monaco"
,"Ulaanbaatar"
,"Podgorica"
,"Rabat"
,"Maputo"
,"Windhoek"
,"Yaren District(no capital city)"
,"Kathmandu"
,"Amsterdam/The Hague" 
,"Wellington"
,"Managua"
,"Niamey"
,"Abuja"
,"Oslo"
,"Muscat"
,"Islamabad"
,"Melekeok"
,"Panama"
,"Port Moresby"
,"Asunción"
,"Lima"
,"Manila"
,"Warsaw"
,"Lisbon"
,"Doha"
,"Bucharest"
,"Moscow"
,"Kigali"
,"Basseterre"
,"Castries"
,"Kingstown"
,"Apia"
,"San Marino"
,"São Tomé"
,"Riyadh"
,"Dakar"
,"Belgrade"
,"Victoria"
,"Freetown"
,"Singapore"
,"Bratislava"
,"Ljubljana"
,"Honiara"
,"Mogadishu"
,"Pretoria /Cape Town (legislative)/ Bloemfontein (judiciary)"
,"Juba"
,"Madrid"
,"Colombo/Sri Jayewardenepura Kotte (legislative)"
,"Khartoum"
,"Paramaribo"
,"Mbabane (administrative)/Lobamba (legislative)"
,"Stockholm"
,"Bern"
,"Damascus"
,"Dushanbe"
,"Dar es Salaam/Dodoma (legislative)"
,"Bangkok"
,"Dili"
,"Lomé"
,"Nuku'alofa"
,"Port-of-Spain"
,"Tunis"
,"Ankara"
,"Ashgabat"
,"Funafuti"
,"Kampala"
,"Kyiv"
,"Abu Dhabi"
,"London"
,"Washington,DC"
,"Montevideo"
,"Tashkent"
,"Port-Vila"
,"Caracas"
,"Hanoi"
,"Sanaa"
,"Lusaka"
,"Harare"};

int w;
for(w=200;w>=0;w--)
  System.out.print("~");
  System.out.println();

for(w=100;w>=0;w--)
System.out.print(" ");
System.out.print("WELCOME in MY ATL@S......!!!!");
 System.out.println();

for(w=200;w>=0;w--)
System.out.print("~");
 System.out.println("\n"+"\n"+"\n"+"\n");

int ch;
do
{
System.out.println("enter your choice"+"\n"+"press 1 to enter country"+"\n"+"press 2 to enter capital"+"\n"+"press any other digit to exit!!!");
  ch=Integer.parseInt(br.readLine());
 

int i,j,l,m,p=0,maxp=0,k,x=0;
char ck,ck2;
boolean found=false;
   String ctr3="",cpt3="",maxs="";  
 
   
   switch(ch)
{





case 1:System.out.println("enter the country");
       String ctr2=br.readLine();
       for( i=0;i<ctr.length;i++)
       {
            ctr3=ctr[i];
           if(ctr2.equalsIgnoreCase(ctr3))
           {
               found=true;break;
            }
        }
        if(found)
        System.out.println("\t"+"\t"+"capital of "+ctr2+" is "+cpt[i]+"\n"+"\n"+"\n");
        
       
        
        
        else
        {
            l=ctr2.length();
            ctr3=ctr[0];
            m=ctr3.length();
            p=0;
            for(j=0;j<Math.min(l,m);j++)
           {
                ck=ctr2.charAt(j);
                 Character.toUpperCase(ck);
                ck2=ctr3.charAt(j);
                Character.toUpperCase(ck2);
                
                if(!(ck==ck2))
                continue;
                 p++;
                 
            }
       
            maxs=ctr3;
            maxp=p;
            x=0;
            
            
           String ctr4="";
           for( k=1;k<ctr.length;k++)
            {
                ctr4=ctr[k];
               int n=ctr4.length();
               int p2=0;
                for(j=0;j<Math.min(l,n);j++)
                {
                     ck=ctr2.charAt(j);
                     Character.toUpperCase(ck);
                    
                     ck2=ctr4.charAt(j);
                     Character.toUpperCase(ck2);
                      

                     if(!(ck==ck2))
                     continue;
                      p2++;
                   
                 }
                  
                
               if(p2>maxp)
              { x=k;
                  maxp=p2;
               maxs=ctr4;
              } 
               ctr4="";
            }
        
         
            System.out.println("\n"+"\t"+ctr2+" not found!!!"+"\n"+"\t"+"\t"+" do you mean "+maxs+" .....?"+"\n"+"\t"+"\t"+"its capital is "+cpt[x]+"\n"+"\n"+"\n");
       }break;
                 
                      
        
        
        
          
  
        case 2:System.out.println("enter the capital");
       String cpt2=br.readLine();


       for( i=0;i<cpt.length;i++)
       {
            cpt3=cpt[i];
           if(cpt2.equalsIgnoreCase(cpt3))
           {
               found=true;break;
            }
        }
        if(found)
        System.out.println("\t"+"\t"+cpt2+" is the capital of" +ctr[i]+"\n"+"\n");
        
        
        
        else
        {
            l=cpt2.length();
            cpt3=cpt[0];
            m=cpt3.length();
            p=0;
            for(j=0;j<Math.min(l,m);j++)
           {
                ck=cpt2.charAt(j);
                 Character.toUpperCase(ck);
                ck2=cpt3.charAt(j);
                Character.toUpperCase(ck2);
                
                if(!(ck==ck2))
                continue;
                 p++;
                 
            }
       
            maxs=ctr3;
            maxp=p;
            x=0;
            
            
           String cpt4="";
           for( k=1;k<cpt.length;k++)
            {
                 cpt4=cpt[k];
               int n=cpt4.length();
               int p2=0;
                for(j=0;j<Math.min(l,n);j++)
                {
                     ck=cpt2.charAt(j);
                     Character.toUpperCase(ck);
                    
                     ck2=cpt4.charAt(j);
                     Character.toUpperCase(ck2);
                      

                     if(!(ck==ck2))
                     continue;
                      p2++;
                   
                 }
                  
                
               if(p2>maxp)
              { maxp=p2;
               maxs=cpt4;
             x=k;
            } 
               cpt4="";
            }
        
         
            System.out.println("\n"+"\t"+cpt2+" not found!!!"+"\n"+"\t"+"\t"+" do you mean "+maxs+".....?"+"\n"+"\t"+"\t"+"it is the capital of "+ctr[x]+"\n"+"\n"+"\n");
       }break;
    }
       
       for( w=100;w>=0;w--)
       System.out.print("_ ");
       System.out.println();

    
}while(ch==1||ch==2); 


System.out.println("bye see you next time...!!!"+"\n");
for(w=70;w>=0;w--)
System.out.print("_@_");

   



     }
}


       
            



         



      