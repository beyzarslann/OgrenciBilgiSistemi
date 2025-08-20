package edu.gazi.FullProject.Cont;

import edu.gazi.FullProject.Dto.OgrenciDto;
import edu.gazi.FullProject.Service.OgrenciService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class Cont {
    private OgrenciService ogrenciService;

    @GetMapping("hepsi")
    public String tumOgrenciler(Model model){
        List<OgrenciDto> listeOgrenciDto = ogrenciService.getButunOgr();
        model.addAttribute("hepsi", listeOgrenciDto);
        return "butunOgrenciler";
    }

    @GetMapping("yeniOgr")
    public String yeniOgrenci(Model model){
        OgrenciDto ogrenciDto = new OgrenciDto();
        model.addAttribute("yeniOgr", ogrenciDto);
        return "yeniOgrenci";
    }

    @PostMapping("kayit")
    public String yeniOgrKaydet(@Valid @ModelAttribute("yeniOgr") OgrenciDto ogrenciDTO, BindingResult result, Model model)
    {
        if(result.hasErrors())
        {
            model.addAttribute("yeniOgr",ogrenciDTO);
            return "/yeniOgrenci";
        }
        ogrenciService.yeniOgrKayit(ogrenciDTO);
        return "redirect:/hepsi";
    }

    @PostMapping("/guncelle/{id}")
    public String yeniOgrKaydet(@PathVariable Long id, @ModelAttribute("guncelOgr") OgrenciDto ogrenciDto)
    {
        ogrenciDto.setNum(id);
        ogrenciService.guncelleTamam(ogrenciDto);
        return "redirect:/hepsi";
    }

    @GetMapping("guncelleOgr/{id}")
    public String guncelleOgrenci(@PathVariable Long id, Model model)
    {
        OgrenciDto ogrenciDTO=ogrenciService.bul(id);
        model.addAttribute("guncelOgr",ogrenciDTO);
        return "guncelOgrenci";
    }

    @GetMapping("sil/{id}")
    public String silOgrenci(@PathVariable Long id)
    {
        ogrenciService.sil(id);
        return "redirect:/hepsi";
    }
    @GetMapping("goruntule/{id}")
    public String goruntuleOgrenci(@PathVariable Long id, Model model)
    {
        OgrenciDto ogrenciDTO=ogrenciService.bul(id);
        model.addAttribute("goruntuleOgr",ogrenciDTO);
        return "gorunOgrenci";
    }


    public Cont(OgrenciService ogrenciService) {
        this.ogrenciService = ogrenciService;
    }

    public OgrenciService getOgrenciService() {
        return ogrenciService;
    }

    public void setOgrenciService(OgrenciService ogrenciService) {
        this.ogrenciService = ogrenciService;
    }
}
