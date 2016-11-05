package spark;


import java.util.Map;

public abstract class TemplateEngine {

    /**
     * Renders a template given a model (map) and a template path
     *
     * @param model the model to use to render the template
     * @param templatePath the path to the template location
     * @return the template rendered using the provided model
     */
    public abstract String render(Map<String, Object> model, String templatePath);

}
