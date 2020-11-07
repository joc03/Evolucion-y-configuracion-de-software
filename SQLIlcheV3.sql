create database IlcheV2;
use IlcheV2;
create table login (
usuario varchar(50) primary key not null,
password_i varchar(50) not null  
);
select * from login;
insert into login (usuario,password_i) values ('david','david');

create table cliente (
codigo_cli varchar(50) primary key not null,
nombre_cli varchar(50) not null,
apellido_cli varchar(50) not null,
dni_ruc_cli varchar(50) not null,
telefo_cli varchar(50) not null,
direccio_cli varchar(50) not null,
email_cli varchar(50) not null
);
select * from cliente;
update cliente set nombre_cli ='Bruno',apellido_cli= 'Apolinario Porras', dni_ruc_cli='78626745' ,
 telefo_cli='954786254', direccio_cli='comas', email_cli='brunopolinario@gmail.com' where  codigo_cli='N00111578' ;
 

create table Maquinaria (
codigo_Maqui varchar(50) primary key not null,
nombre_Maqui varchar(50) not null,
cantidad_Maqui decimal(8,2) not null,
precio_Maqui decimal(8,2) not null,
peso_Maqui decimal(8,2) not null,
dimesio_Maqui decimal(8,2) not null
);
select * from Maquinaria;

create table vehiculo (
codigo_vehi varchar(50) primary key not null,
placa_vehi varchar(50) not null,
poliza_vehi varchar(50) not null,
pesoTara_vehi decimal(8,2) not null,
PesoBruto_vehi decimal(8,2) not null,
cargoUni_vehi decimal(8,2) not null
);
select * from vehiculo;
SELECT count(*) FROM Maquinaria;

create table AlquilerMaquinaria (
tipoMaqui varchar(50) primary key not null,
costoMaqui decimal(8,2) not null
);

SELECT * FROM AlquilerMaquinaria;
insert into AlquilerMaquinaria(tipoMaqui,costoMaqui) values ('CARGADOR FRONTAL',1200);
insert into AlquilerMaquinaria(tipoMaqui,costoMaqui) values ('CARGADOR FRONTAL',1200);
insert into AlquilerMaquinaria(tipoMaqui,costoMaqui) values ('CARGADOR FRONTAL',1200);
insert into AlquilerMaquinaria(tipoMaqui,costoMaqui) values ('CARGADOR FRONTAL',1200);
insert into AlquilerMaquinaria(tipoMaqui,costoMaqui) values ('CARGADOR FRONTAL',1200);
insert into AlquilerMaquinaria(tipoMaqui,costoMaqui) values ('CARGADOR FRONTAL',1200);
insert into AlquilerMaquinaria(tipoMaqui,costoMaqui) values ('CARGADOR FRONTAL',1200);

-- tabla para cotización
create table cotizacionMaqui (
maquina varchar(50) primary key not null,
dias int not null,
cantidad int not null,
precio decimal(8,2) not null,
subtotal decimal(8,2) not null
);
insert into cotizacionMaqui(maquina,dias,cantidad,precio,subtotal) values 
('MINI EXCAVADORA',1,1,1200,1200);
select * from cotizacionMaqui;
delete from cotizacionMaqui where maquina='MINI EXCAVADORA ';
select precio_Maqui from Maquinaria where nombre_Maqui='CARGADOR FRONTAL';
select sum(subtotal) from cotizacionMaqui;

create table cotizacionTransportemaquinaria (
Maqui varchar(50) primary key not null,
depa varchar(50)  not null,
viajes int not null,
precio decimal(8,2) not null,
subtotal decimal(8,2) not null
);
select * from cotizacionTransportemaquinaria;

create table cotizacionTransporteMateriales (
descrip varchar(50) primary key not null,
depa varchar(50)  not null,
viajes int not null,
precio decimal(8,2) not null,
subtotal decimal(8,2) not null
);
select * from cotizacionTransporteMateriales;
select precio_Maqui from Maquinaria where nombre_Maqui='TRACTOR';


create table chofer (
chof_cod varchar(50) primary key not null,
chof_nom varchar(50) not null,
chof_ape varchar(50) not null,
chof_dni varchar(50) not null,
chof_cod_lic varchar(50) not null
);

create table AlquileMaquinaria(
cod_Maquina varchar(50) primary key not null,
Tipo_maquinaria varchar(50) not null,
codCont varchar(50) not null,
dias decimal(5,2) not null,
cantidad decimal(5,2) not null,
precio numeric(10,2) not null,
subtotal numeric (10,2) not null
);
select * from AlquileMaquinaria;
truncate table AlquileMaquinaria;
drop table AlquileMaquinaria;

create table RegistrarAlquiler(
codigo varchar(50) primary key not null,
codCont varchar(50) not null,
nombre varchar(50) not null,
dni varchar(50) not null,
precio numeric(10,2) not null,
FechaInicio date not null,
FechaFin date not null
);
select * from RegistrarAlquiler;

create table PrecioTransporte (
codigo varchar (50) primary key not null,
departamento varchar(50) not null,
Precio numeric (10,2) not null
);
insert into PrecioTransporte
 (codigo,departamento,Precio) values 
 ('DE001','AMAZONAS',800), 
 ('DE002','ANCASH',600),
('DE003','APURIMAC',300),
('DE004','AREQUIPA',300),
('DE005','AYACUCHO',250),
 ('DE006','CAJAMARCA',750),
 ('DE007','CUSCO',500),
 ('DE008','HUANCAVELICA',200),
 ('DE009','HUÁNUCO',600),
 ('DE010','ICA',150),
 ('DE011','JUNIN',250),
 ('DE012','LA LIBERTAD',650),
 ('DE013','LAMBAYEQUE',700),
 ('DE014','LIMA',250),
 ('DE015','LORETO',850),
 ('DE016','MADRE DE DIOS',550),
 ('DE017','MOQUEGUA',350),
 ('DE018','PASCO',550),
 ('DE019','PIURA',800),
 ('DE020','PUNO',450),
 ('DE021','SAN MARTIN',700),
 ('DE022','TACNA',400),
 ('DE023','TUMBES',850),
 ('DE024','UCAYALI',550);
 
 select * from PrecioTransporte;
 
 
 create table TransporteMaquinaria (
 codigo varchar(50) primary key not null,
 codCont varchar(50) not null,
 placaVehiculo varchar(50) not null,
 maquina varchar(50) not null,
 departamento varchar(50) not null,
 cantidad int not null,
 precio numeric(10,2) not null,
 subtotal numeric(10,2) not null
 );
 
select * from  TransporteMaquinaria;
SELECT count(*) FROM TransporteMaquinaria;

create table CE_chofer (
chof_cod varchar(50) primary key not null,
chof_nom varchar(50) not null,
chof_ape varchar(50) not null,
chof_dni varchar(50) not null,
chof_cod_lic varchar(50) not null
);

insert into CE_chofer
(chof_cod,chof_nom,chof_ape,chof_dni,chof_cod_lic) values
('CHF001','DANIEL','SEBASTIAN','78547254','E07847105'),
('CHF002','JUAN','SANTISTEBAN','74857425','E05815484'),
('CHF003','FRANK','DAMIAN','74852145','E03847478'),
('CHF004','ROGER','HOYS','74854763','E08847152'),
('CHF005','JESUS','DAMIAN','75894852','E06845712')
 ;

select * from ce_chofer;
---------------------------------------
create table SolicitudTransporte (
cod varchar(50) primary key not null,
dniCliente varchar(50) not null,
PrecioSolicitud numeric(10,2) not null,
CodChofer varchar(50) not null,
FechaSalida date not null
);
select * from SolicitudTransporte;

create table ContenidoTransporte(
cod varchar(50) primary key not null,
codCont varchar(50) not null,
vehiculo varchar(50) not null,
maquina varchar(50) not null,
depa varchar(50) not null,
cant int not null,
precio numeric(10,2) not null,
subtotal numeric(10,2) not null
);

select * from ContenidoTransporte;

create table contadorTransporte(
cod varchar(20) primary key not null,
cont int not null
);

------------------------------------------

select sum(subtotal) from TransporteMaquinaria;

create table RegistrarPedido(
cod varchar(50) primary key not null,
tipoPedido varchar(50) not null,
codCont varchar(50) not null,
nombre varchar(50) not null,
dni varchar(50) not null,
pre numeric(10,2) not null,
fechI varchar(50) not null,
FechaF varchar(50) not null
);
select * from RegistrarPedido;

create table boleta(
codigo varchar(50) primary key not null,
dniCliente varchar(50) not null,
codCont varchar(50) not null,
nombre varchar(50) not null,
PrecioT numeric(10,2) not null,
FechaI varchar(50) not null,
FechaF varchar(50) not null,
TipoPed varchar(50) not null
);
select * from boleta;
drop table boleta;

-----------------------------------

create table ContenidoAlquiler(
cod varchar(50) primary key not null,
descripción varchar(50) not null,
codCont varchar(50) not null,
cantidad int not null,
dias int not null,
precio numeric(10,2) not null,
subtotal numeric(10,2) not null
);

select * from contenidoalquiler;
DELETE FROM ContenidoAlquiler    WHERE cod='CT06';
select * from ContenidoAlquiler where    codCont='C8';
delete from contenidoalquiler where cod='CT01';

create table contador(
cod varchar(20) primary key not null,
cont int not null
);
select * from contador;
select * from cliente;
select dni_ruc_cli from cliente where dni_ruc_cli='75626795' and nombre_cli='Jose David';

create table contadorPedido(
cod varchar(20) primary key not null,
cont int not null
);
select * from contadorPedido;

select cod,tipoPedido,dni,codCont,nombre,pre,fechI,FechaF from RegistrarPedido;
