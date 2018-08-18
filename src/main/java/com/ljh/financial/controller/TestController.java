package com.ljh.financial.controller;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liangjh
 * @create 2018-08-18 16:25
 **/
@RestController
@Api(description = "test")
@RequestMapping("/api/v1/test")
public class TestController {



    @GetMapping
    @ApiOperation(value = "doc")
    public ResponseEntity<?> doc() throws IOException, TemplateException {

        Configuration configuration = new Configuration(Configuration.VERSION_2_3_28);
        configuration.setDirectoryForTemplateLoading(new File("C:\\Users\\l\\Desktop"));
        configuration.setDefaultEncoding("UTF-8");

        Template template = configuration.getTemplate("projectName.xml");
        Map<String, Object> root = new HashMap<>();
//        root.put("projectName", "\u2612".concat("  ").concat("\u2610"));
        root.put("projectName", "我不是药神");
        File outFile = new File("C:\\Users\\l\\Desktop\\projectName.docx");
        Writer out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        template.process(root, out);
        out.flush();
        out.close();

        return ResponseEntity.ok("200OK");
    }
}
