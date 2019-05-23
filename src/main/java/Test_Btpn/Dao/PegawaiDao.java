package Test_Btpn.Dao;

import java.util.List;

import Test_Btpn.Model.PegawaiModel;

public interface PegawaiDao {
	
	List<PegawaiModel> getAll();
	PegawaiModel getPegawaiById(int id);
	
	void addPegawai(PegawaiModel pegawai);
	void updatePegawai (PegawaiModel pegawai,int id);
	void DeletePegawai (int id);
	
}
