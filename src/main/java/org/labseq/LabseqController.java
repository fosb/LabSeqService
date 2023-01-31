package org.labseq;

import org.springframework.web.bind.annotation.*;

@RestController
public class LabseqController {
    /**
     * Endpoint that receives a number and returns the value of l(n) for the given input
     * @param inputNumber the input number
     * @return the value of l(n) for the given input
     */
    @GetMapping("/labseq/{n}")
    public int getLabseqValue(@PathVariable int n) {
        return Labseq.compute(n);
    }

    @GetMapping("/labseq")
    public int getLabseqValue2(@RequestParam int inputNumber) {
        return Labseq.compute(inputNumber);
    }
}