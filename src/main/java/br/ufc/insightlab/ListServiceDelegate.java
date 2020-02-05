package br.ufc.insightlab;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ListServiceDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.getVariables();
        System.out.println(delegateExecution.getCurrentActivityName());
    }
}
