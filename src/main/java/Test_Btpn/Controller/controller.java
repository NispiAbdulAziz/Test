package Test_Btpn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import Test_Btpn.Model.PegawaiModel;
import Test_Btpn.service.PegawaiService;

@Controller 
@RequestMapping("/pegawai")
public class controller {

	@Autowired
	PegawaiService pegawaiService;
	
	@GetMapping("/{id}")

	public ResponseEntity<PegawaiModel> getById(@PathVariable("id") int id){
		PegawaiModel pegawai = pegawaiService.getPegawaiById(id);

	return new ResponseEntity<PegawaiModel>(pegawai, HttpStatus.OK);

	}
	
	@PostMapping("/")

	public ResponseEntity<PegawaiModel> AddPegawai(@RequestBody PegawaiModel pegawai){

	pegawaiService.addPegawai(pegawai);

	return new ResponseEntity<PegawaiModel>(pegawai,HttpStatus.OK);

	}
	
	@PutMapping("/{id}")

	public ResponseEntity<PegawaiModel> updatePegawai(@PathVariable("id") int id, @RequestBody PegawaiModel pegawai){

	pegawaiService.updatePegawai(pegawai,id);

	PegawaiModel pegawaii = pegawaiService.getPegawaiById(id);

	return new ResponseEntity<PegawaiModel>(pegawaii, HttpStatus.OK);

	}
	
	@DeleteMapping("/{id}")

	public ResponseEntity<PegawaiModel> deletePegawai(@PathVariable("id") int id){

	PegawaiModel pegawai = pegawaiService.getPegawaiById(id);

	pegawaiService.DeletePegawai(id);

	return new ResponseEntity<PegawaiModel>(pegawai,HttpStatus.OK);

	}
}
