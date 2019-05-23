package Test_Btpn.service;

import java.util.List;

import Test_Btpn.Model.PegawaiModel;

public interface PegawaiService {
	List<PegawaiModel> getAll();
	PegawaiModel getPegawaiById(int id);
	
	void addPegawai(PegawaiModel pegawai);
	void updatePegawai (PegawaiModel pegawai,int id);
	void DeletePegawai (int id);
	
}
