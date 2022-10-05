/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Config.Conexion;
import Modelo.Categoria;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author alexis
 */
@Controller
public class CategoriaController {

    Conexion con = new Conexion();
    JdbcTemplate template = new JdbcTemplate(con.conexion());
    ModelAndView mv = new ModelAndView();
    List datos;
    int id;

    @RequestMapping("index.htm")
    public ModelAndView index() {
        String sql = "select * from categorias where estado=1";
        datos = this.template.queryForList(sql);
        mv.addObject("lista", datos);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView agregar() {
        mv.setViewName("agregar");
        return mv;
    }

    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView agregar(Categoria categoria) {
        String sql = "Insert into categorias(nombre , estado) value (?,1)";
        this.template.update(sql, categoria.getNombre());
        return new ModelAndView("redirect:/index.htm");
    }

    @RequestMapping(value = "editar.htm", method = RequestMethod.GET)
    public ModelAndView editar(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "select *  from categorias  where id=" + id;
        datos = this.template.queryForList(sql);
        mv.addObject("lista", datos);
        mv.setViewName("editar");
        return mv;

    }

    @RequestMapping(value = "editar.htm", method = RequestMethod.POST)
    public ModelAndView editar(Categoria categoria) {
        String sql = "Update categorias set nombre=? where id=" + id;
        this.template.update(sql, categoria.getNombre());
        return new ModelAndView("redirect:/index.htm");

    }

     @RequestMapping(value = "eliminar.htm")
    public ModelAndView eliminar(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "update categorias set estado=0 where id = " + id;
        this.template.update(sql);
        return new ModelAndView("redirect:/index.htm");
    }

}
