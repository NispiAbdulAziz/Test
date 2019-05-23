package Test_Btpn.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PegawaiMapper implements RowMapper<PegawaiModel> {

	public PegawaiModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		PegawaiModel pegawai= new PegawaiModel();
		pegawai.setId(rs.getInt("id"));
		pegawai.setNama(rs.getString("nama"));
		pegawai.setTanggal_lahir(rs.getDate("tanggal_lahir"));
		pegawai.setGaji(rs.getInt("gaji"));
		
		return pegawai;
	}

}
