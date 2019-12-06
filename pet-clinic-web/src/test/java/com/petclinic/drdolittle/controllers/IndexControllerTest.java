package com.petclinic.drdolittle.controllers;

//import com.petclinic.drdolittle.model.Visit;
//import com.petclinic.drdolittle.services.springdatajpa.VisitSDJpaService;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.ArgumentCaptor;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MockMvcBuilder;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.ui.Model;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class IndexControllerTest {

//    @Mock
//    VisitSDJpaService visitSDJpaService;
//
//    @Mock
//    Model model;
//
//    IndexController controller;
//    @Before
//    public void setUp() throws Exception{
//        MockitoAnnotations.initMocks(this);
//        controller=new IndexController();
//
//    }
//
//    @Test
//    public void testMockMVC()throws Exception {
//        MockMvc mockMvc= MockMvcBuilders.standaloneSetup(controller).build();
//        mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("index"));
//    }
//
//    @Test
//    public void index() {
//
//        Set<Visit> visitSet = new HashSet<>();
//        visitSet.add(new Visit());
//
//        Visit visit=new Visit();
//        visit.setId(1L);
//        visitSet.add(visit);
//        when(visitSDJpaService.findAll()).thenReturn(visitSet);
//        ArgumentCaptor<Set<Visit>> argumentCaptor=
//                ArgumentCaptor.forClass(Set.class);
//
//        String viewName=controller.index();
//        assertEquals("index", viewName);
//
//        verify(visitSDJpaService,times(1)).findAll();
//        verify(model,times(1))
//                .addAttribute(eq("visits"),argumentCaptor.capture());
//
//        Set<Visit>setInController=argumentCaptor.getValue();
//        assertEquals(2,setInController.size());
//    }
}