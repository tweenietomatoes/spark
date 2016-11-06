package spark;

import java.util.Map;

public abstract class TemplateEngine {

    /**
     * Renders a template given a model (map) and a template path
     *
     * @param templatePath the path to the template location
     * @param model        the model to use to render the template
     * @return the template rendered using the provided model
     */
    public abstract String render(String templatePath, Map<String, Object> model);

}
