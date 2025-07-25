package com.example.CliApp.service;

import com.example.CliApp.model.Script;
import com.example.CliApp.repository.ScriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScriptService {

    private final ScriptRepository scriptRepository;

    @Autowired
    public ScriptService(ScriptRepository scriptRepository){
        this.scriptRepository = scriptRepository;
    }

    //create a new script
    public Script createScript(Script script){
        return scriptRepository.save(script);
    }

    //get script by id
    public Optional<Script> getScriptById(Long id){
        return scriptRepository.findById(id);
    }

    //get script by name
    public Optional<Script> getScriptByName(String name){
        return scriptRepository.findByName(name);
    }

    


}
