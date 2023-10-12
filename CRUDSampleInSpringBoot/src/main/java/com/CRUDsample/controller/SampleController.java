package com.CRUDsample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.CRUDsample.model.EntitySample;
import com.CRUDsample.repository.SampleRepository;

@Controller
public class SampleController {
	
	@Autowired
	private SampleRepository sampleRepository; 

	@GetMapping("/list")
	public String getAll(Model model)
	{
		List<EntitySample> list=sampleRepository.findAll();
		System.out.println(list);
		model.addAttribute("name_list",list );
		return "all";
	}
	
	@GetMapping("/load_form")
	public String loadForm() {
		return "add";
	}
	
	@GetMapping("/edit_form/{id}")
	public String editForm(@PathVariable(value="id") int id,Model model)
	{
		Optional<EntitySample> samplename=sampleRepository.findById(id);
				EntitySample sample=samplename.get();
				model.addAttribute("sample_details", sample);
				return "edit";
	}
	
	@PostMapping("/update_sample")
	public String updateSample(@ModelAttribute EntitySample sample)
	{
		sampleRepository.save(sample);
		System.out.println(sample);
		return "redirect:/list";
	}
	
	@PostMapping("/add_sample")
	public String saveSample(@ModelAttribute EntitySample sample)
	{
		sampleRepository.save(sample);
		return "redirect:/load_form";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteSample(@PathVariable(value="id") int id)
	{
		sampleRepository.deleteById(id);
		return "redirect:/list";
		
	}
}
