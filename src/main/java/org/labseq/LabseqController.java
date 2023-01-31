package org.labseq;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabseqController {
    /**
     * Endpoint that receives a number and returns the value of l(n) for the given input
     * @param n the input number
     * @return the value of l(n) for the given input
     */
    @GetMapping("/labseq/{n}")
    public int getLabseqValue(@PathVariable int n) {
        return Labseq.compute(n);
    }
}