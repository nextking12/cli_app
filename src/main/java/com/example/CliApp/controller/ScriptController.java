package com.example.CliApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CliApp.model.Script;
import com.example.CliApp.service.ScriptService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/scripts")
public class ScriptController {

    private final ScriptService scriptService;

    @Autowired
    public ScriptController(ScriptService scriptService){
        this.scriptService = scriptService;
    }

    //POST /api/scripts 
    // creates new script
    @PostMapping
     public ResponseEntity<Script> createScript(@RequestBody Script script) {
        Script createdScript = scriptService.createScript(script);
        return new ResponseEntity<>(createdScript, HttpStatus.CREATED);
    }

     // GET /api/scripts/{id}
    // Retrieves a script by ID
    @GetMapping("/{id}")
    public ResponseEntity<Script> getScriptById(@PathVariable Long id) {
        return scriptService.getScriptById(id)
                .map(script -> new ResponseEntity<>(script, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/byName/{name}")
public ResponseEntity<Script> getScriptByName(@PathVariable String name) {
    return scriptService.getScriptByName(name)
            .map(script -> new ResponseEntity<>(script, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
}

    // GET /api/scripts
    // Retrieves all scripts
    @GetMapping
    public ResponseEntity<List<Script>> getAllScripts() {
        List<Script> scripts = scriptService.getAllScripts();
        return new ResponseEntity<>(scripts, HttpStatus.OK);
    }

     // PUT /api/scripts/{id}
    // Updates an existing script
    @PutMapping("/{id}")
    public ResponseEntity<Script> updateScript(@PathVariable Long id, @RequestBody Script script) {
        try {
            // The service method now returns Script directly or throws an exception
            Script updatedScript = scriptService.updateScript(id, script);
            return new ResponseEntity<>(updatedScript, HttpStatus.OK);
        } catch (RuntimeException e) {
            // Catch the exception thrown by the service if script is not found
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // DELETE /api/scripts/{id}
    // Deletes a script by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteScript(@PathVariable Long id) {
        try {
            scriptService.deleteScript(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    // DELETE /api/scripts/byName/{name}
    // Deletes a script by Name
    @DeleteMapping("/byName/{name}")
    public ResponseEntity<Void> deleteScriptByName(@PathVariable String name) {
        try {
            scriptService.deleteScriptByName(name);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    

}
