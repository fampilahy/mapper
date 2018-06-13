To continue on mapping and post listener on client interface

Check mapping modeling on
https://www.lucidchart.com/documents/edit/ae711883-1976-4a38-8c4a-4e0c01c0e7d4/0?shared=true&docId=ae711883-1976-4a38-8c4a-4e0c01c0e7d4

chubb wsdl interface
http://chubb.dev.cloudapp.banregio.com/chubb/ExternalCmsWsUAT/ExternalWSCMS.svc
http://chubb.dev.cloudapp.banregio.com/chubb/ExternalCmsWsUAT/ExternalWSCMS.svc?wsdl
·         Servicio de Campañas: https://testwebservices.chubblatinamerica.com/ExternalCmsWsUAT/ExternalWSCMS.svc
·         Servicio de transacciones: https://testwebservices.chubblatinamerica.com/ExternalS6TransactionWSUAT/S6TransactionExternal.svc
·         Servicio de cálculo de primas: https://testwebservices.chubblatinamerica.com/ExternalPremiumCalculatorWsUAT/ExternalWSPremium.svc
http://chubb.dev.cloudapp.banregio.com/chubb/ExternalCmsWsUAT/ExternalWSCMS.svc?singleWsdl

chubb doc
https://docs.google.com/document/d/1VIkme7jj5IBqWZYWq4KNiOqlJDn-l1JsvWJKDoh3sf0/edit?ts=5b1845a8#heading=h.gjdgxs

entry point from Norma
https://docs.google.com/spreadsheets/d/1UwTHjwQT8bD29OfjC7Zdy7Oj1ueJnoER83rjP8UpzUY/edit?ts=5b1fe5c7#gid=887782669

new entry from Norma 
https://drive.google.com/file/d/1gFC3q5mlUJgP6g0waFVm_2_DsCSppcLR/view?ts=5b2140d8



Tmp_NumCom char(3) NOT NULL,
Tmp_NumPro char(2) NOT NULL,
Tmp_NumPol varchar(15) NOT NULL,
Tmp_Asegur char(100) NOT NULL,
Tmp_DesPro char(40) NOT NULL,
Tmp_Nombre varchar(40) NOT NULL,
Tmp_ApePat varchar(40) NOT NULL,
Tmp_ApeMat varchar(40) NOT NULL,
Tmp_FecNac varchar(10) NOT NULL,
Tmp_Edad int NOT NULL,
Tmp_RFC char(15) NOT NULL,
Tmp_Email varchar(254) NOT NULL,
Tmp_Telefo varchar(20) NOT NULL,
Tmp_CalNum char(50) NOT NULL,
Tmp_Coloni varchar(150) NOT NULL,
Tmp_Locali char(40) NOT NULL,
Tmp_Entida char(30) NOT NULL,
Tmp_PriAnu smallmoney NOT NULL,
Tmp_NumPag int NOT NULL,
Tmp_PriPag smallmoney NOT NULL,
Tmp_PagSub smallmoney NOT NULL,
Tmp_FecIni varchar(10) NOT NULL,
Tmp_FecFin varchar(10) NOT NULL,
Tmp_Paquet char(2) NOT NULL,
Tmp_TipPla char(2) NOT NULL,
Tmp_TipRen char(1) NOT NULL,
Tmp_Nombr1 varchar(140) NOT NULL,
Tmp_Paren1 varchar(25) NOT NULL,
Tmp_Porce1 char(3) NOT NULL,
Tmp_Nombr2 varchar(140) NOT NULL,
Tmp_Paren2 varchar(25) NOT NULL,
Tmp_Porce2 char(3) NOT NULL,
Tmp_Nombr3 varchar(140) NOT NULL,
Tmp_Paren3 varchar(25) NOT NULL,
Tmp_Porce3 char(3) NOT NULL,
Tmp_Nombr4 varchar(140) NOT NULL,
Tmp_Paren4 varchar(25) NOT NULL,
Tmp_Porce4 char(3) NOT NULL,
Tmp_RieCal char(50) NOT NULL,
Tmp_RieCol varchar(150) NOT NULL,
Tmp_RieLoc char(40) NOT NULL,
Tmp_RieEnt char(30) NOT NULL,
Tmp_RieCop char(6) NOT NULL,
Tmp_RieTel varchar(20) NOT NULL,
Tmp_GirDes varchar(100) NOT NULL,
Tmp_CodPos char(6) NOT NULL,
Tmp_EmaAdi varchar(254),
Tmp_CelAdi bigint NOT NULL,
Tmp_Parent varchar(50) NOT NULL,
Tmp_FecMod varchar(10) NOT NULL,
Tmp_MotCan varchar(50) NOT NULL,
Tmp_FecCan varchar(10) NOT NULL,
NumTransac char(10) NOT NULL,
Transaccio char(3) NOT NULL,
Usuario char(6) NOT NULL,
FechaSis smalldatetime NOT NULL,
SucOrigen char(3) NOT NULL,
SucDestino char(3) NOT NULL
SucDestino char(3) NOT NULL