package Test_Btpn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Test_Btpn.Dao.PegawaiDao;
import Test_Btpn.Model.PegawaiModel;

@Service
public class PegawaiServiceImpl implements PegawaiService{

	@Autowired
	private PegawaiDao pegawaiDao;
	
	public List<PegawaiModel> getAll() {
		// TODO Auto-generated method stub
		return pegawaiDao.getAll();
	}

	public PegawaiModel getPegawaiById(int id) {
		// TODO Auto-generated method stub
		return pegawaiDao.getPegawaiById(id);
	}

	public void addPegawai(PegawaiModel pegawai) {
		// TODO Auto-generated method stub
		pegawaiDao.addPegawai(pegawai);
	}

	public void updatePegawai(PegawaiModel pegawai, int id) {
		// TODO Auto-generated method stub
		pegawaiDao.updatePegawai(pegawai, id);
	}

	public void DeletePegawai(int id) {
		// TODO Auto-generated method stub
		pegawaiDao.DeletePegawai(id);
	}

}
