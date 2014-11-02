#####Háskólinn í Reykjavík        	  						        
#####Haustönn 2014   

#####Hugbúnaðarfræði 
#####T-303-HUGB           
#####Kennari: Hannes Pétursson

#####Nemendur:  Alexandra Einarsdóttir
#####Anna Louise Ásgeirsdóttir
#####Birgitta Ósk Rúnarsdóttir
#####Kolbrún Freyja Davidsen     
#####Perla Þrastardóttir
#####Sonja Steinarsdóttir

###Hönnunarskýrsla
------------------

Þessi hönnunarskýrsla er unnin sem liður í síðannarverkefni í Hugbúnaðarfræði við Háskólann í Reykjavík. 
Verkefnið fólst í því að útfæra hinn sívinsæla leik “TicTacToe”, einnig þekktur sem “Mylla” með því að notfæra okkur þær aðferðir 
sem við höfum lært í síðari hluta námskeiðsins. Þær aðferðir eru meðal annars þær að beita “prófanadrifinni þróun” 
(Test Driven Development), það er að segja við skrifum prófanir fyrir einingar kóðans áður en kóðinn sjálfur er skrifaður.  
Við skrifum leikinn í Java og notfærum okkur samstæðustjórnunarkerfið Github til að halda utan um kóðann.

###Klasarit

![Klasarit] (http://i58.tinypic.com/ab1i5j.jpg)

Við teiknuðum gróft klasarit á töflu, en þegar við teiknuðum það upp í þar til gerðu forriti bættist aðeins við, eins og til dæmis 
áttuðum við okkur ekki á því að það þyrfti sennilega Movement klasa. 

Hér að ofan má sjá upphaflegt klasarit og samanstóð það af 6 klösum.  þegar leið á fækkaði klösunum um 2, það er að segja Movement og Game duttu út.

Stærðin á borðinu er 3x3, og við reyndum að útfæra það með tvívíðu fylki til að byrja með. Það reyndist okkur ekki vel, og þar sem 
þetta er föst stærð ákvaðum við að færa þetta í einvítt fylki, þar sem fyrsta röðin er 0-2, önnur 3-5, og þriðja 6-8.

Borðið lítur þá svona út:

           |       |
       0   |   1   |   2
           |       |
    -----------------------
           |       |
       3   |   4   |   5
           |       |
    -----------------------
           |       |
       6   |   7   |   8
           |       |

Leikurinn getur aðeins endað á þrjá vegu, spilarinn vinnur, tölvan vinnur eða það verður jafntefli.  Til vinna þarf að ná þremur X í 
röð hvort sem um er að ræða lárétta línu, lóðrétta línu eða á ská.  Mögulegar vinningslínur eru því átta talsins, 
[0,1,2], [3,4,5], [6,7,8], [0,3,6], [1,4,7], [2,5,8], [0,4,8] og [2,4,6].

Því næst var hafist handa við að skrifa prófanir, okkur fannst frekar óþjált að vinna það allar saman, svo við skiptum okkur í 3 pör, og hvert par vann í einni prófun, og því næst í leiknum sjálfum við að útfæra þá klasa sem prófanir voru tilbúnar fyrir. Það endaði 
með því að þetta var unnið í blöndu af “allar vinna saman” og “paravinnu”.

Forritunarhlutinn og prófanirnar gengu í raun ágætlega þó ekki séum við með mikinn grunn í Java.  Við vorum frekar snemma í ferlinu 
komnar með leik sem við gátum keyrt í Console.  Það reyndist hinsvegar heilmikið mál að fá Heroku til að virka eins og skyldi og 
áttum við í ýmsum tengingarvandamálum sem gekk frekar erfiðlega að leysa úr. 

Við ákváðum að hafa okkar útgáfu leiksins einfalda enda er Mylla í eðli sínu afar einfaldur leikur. Við ákváðum að gera einfalt en 
skýrt útlit á leikinn og notuðum til þess HTML og Bootstrap. 

