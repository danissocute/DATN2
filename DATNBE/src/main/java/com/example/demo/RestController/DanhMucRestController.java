package com.example.demo.RestController;

import com.example.demo.entity.DanhMuc;
import com.example.demo.repository.DanhMucDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/danhmuc")
public class DanhMucRestController {
    @Autowired
    DanhMucDAO danhMucDAO;

    @GetMapping()
    public List<DanhMuc> getListDanhMuc() {
        return danhMucDAO.findAll();
    }

    @GetMapping("/{ma}")
    public DanhMuc getDanhMucByMa(@PathVariable("ma") String ma) {
        return danhMucDAO.findDanhMucByMa(ma);
    }

    @PostMapping()
    public DanhMuc createDanhMuc(@RequestBody DanhMuc danhMuc) {
        return danhMucDAO.save(danhMuc);
    }

    @PostMapping("/{ma}")
    public DanhMuc updateDanhMuc(@PathVariable("ma") String ma, @RequestBody DanhMuc danhMuc) {
        return danhMucDAO.save(danhMuc);
    }

    @DeleteMapping("/{ma}")
    public void delete(@PathVariable("ma") String ma) {
        danhMucDAO.deleteDanhMucByMa(ma);
    }
}
