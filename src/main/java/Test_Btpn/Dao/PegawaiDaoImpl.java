package Test_Btpn.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Test_Btpn.Model.PegawaiMapper;
import Test_Btpn.Model.PegawaiModel;

@Transactional

@Repository
public class PegawaiDaoImpl implements PegawaiDao{

	@Autowired

	private JdbcTemplate jdbcTemplate;
	
	public List<PegawaiModel> getAll() {
		// TODO Auto-generated method stub
		String sql = "select * from pegawai order by id asc";

		List<PegawaiModel> pegawai = jdbcTemplate.query(sql, new PegawaiMapper());

		return pegawai;
	}

	public PegawaiModel getPegawaiById(int id) {
		// TODO Auto-generated method stub
		String sql2 = "select * from pegawai where id = ?";

		PegawaiModel rest2 = jdbcTemplate.queryForObject(sql2, new Object[]{id}, new PegawaiMapper());

		return rest2;
	}

	public void addPegawai(PegawaiModel pegawai) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO pegawai (id, nama, tanggal_lahir, gaji) VALUES (?, ?, ?, ?) ";

		jdbcTemplate.update(sql, pegawai.getId(), pegawai.getNama(), pegawai.getTanggal_lahir(),pegawai.getGaji());
	}

	public void updatePegawai(PegawaiModel pegawai, int id) {
		// TODO Auto-generated method stub
		String sql = "update pegawai set id=?, nama=? ,tanggal_lahir=?, gaji=? where id=?";

		jdbcTemplate.update(sql,pegawai.getId(), pegawai.getNama(),pegawai.getTanggal_lahir(),pegawai.getGaji(), id);
		
	}

	public void DeletePegawai(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from pegawai where id=?";
		jdbcTemplate.update(sql,id);
	}


}
