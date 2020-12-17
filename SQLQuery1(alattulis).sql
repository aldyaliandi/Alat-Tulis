create database db_AlatTulis

use db_AlatTulis

create table table_karyawan(
nik varchar(50) not null primary key,
nama_karyawan varchar (50),
lahir_karyawan date,
kelamin_karyawan char (1),
alamat_karyawan text,
email_karyawan text
)
drop table table_karyawan
create table table_login(
nik varchar(50) foreign key references table_karyawan (nik),
username varchar (50)primary key,
password text
)
drop table table_login
create table table_barang(
id_barang int primary key,
nama_barang varchar (50),
kode_barang varchar (30),
harga_barang int,
stok_barang int
)
drop table table_barang
create table table_transaksi(
id_transaksi int primary key,
id_karyawan int foreign key references table_karyawan (nik),
id_barang int foreign key references table_barang (id_barang),
kode_barang varchar (30),
tanggal_transaksi date,
sub_total int,
jumlah_bayar int
)
drop table table_transaksi
create PROCEDURE generateIDbarang 
AS BEGIN 
	DECLARE @count int 

	select @count = max(id_barang) from table_barang;
	if(@count is null)
		select "id_barang" = 1
	else select "id_barang" = @count + 1
END

create PROCEDURE generateIDtransaksi
AS BEGIN 
	DECLARE @count int 

	select @count = max(id_transaksi) from table_transaksi;
	if(@count is null)
		select "id_transaksi" = 1
	else select "id_transaksi" = @count + 1
END
drop procedure generateIDtransaksi
drop procedure generateIDbarang
select  * from  table_karyawan
insert table_karyawan values  ('df','dsd','sds','P','sasa','sasa')
