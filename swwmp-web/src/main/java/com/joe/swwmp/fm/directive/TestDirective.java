package com.joe.swwmp.fm.directive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import freemarker.core.Environment;
import freemarker.template.ObjectWrapper;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

public class TestDirective implements TemplateDirectiveModel{

	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body)
			throws TemplateException, IOException {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("This is Joe");
		env.setVariable("testList", ObjectWrapper.BEANS_WRAPPER.wrap(list));
		body.render(env.getOut());
	}

}
