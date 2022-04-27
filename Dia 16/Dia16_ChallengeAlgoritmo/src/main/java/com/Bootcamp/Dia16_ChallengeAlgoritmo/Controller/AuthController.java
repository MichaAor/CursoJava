package com.Bootcamp.Dia16_ChallengeAlgoritmo.Controller;

import com.Bootcamp.Dia16_ChallengeAlgoritmo.Model.UserModel;
import com.Bootcamp.Dia16_ChallengeAlgoritmo.Service.UserService;
import com.Bootcamp.Dia16_ChallengeAlgoritmo.Util.JWTRequest;
import com.Bootcamp.Dia16_ChallengeAlgoritmo.Util.JWTResponse;
import com.Bootcamp.Dia16_ChallengeAlgoritmo.Util.JWTTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
       @Autowired
       UserService userService;

       @Autowired
       private AuthenticationManager authenticationManager;

       @Autowired
       private JWTTokenUtil jwtTokenUtil;


        @PostMapping("/login")
        public ResponseEntity<?> loginUser(@RequestBody JWTRequest authenticationRequest) throws Exception {
            authenticate(authenticationRequest.getUsername(),authenticationRequest.getPassword());

            final UserDetails userDetails = userService.loadUserByUsername(authenticationRequest.getUsername());

            final String token = jwtTokenUtil.generateToken(userDetails);

            return ResponseEntity.ok(new JWTResponse(token));
        }

        @PostMapping("/register")
        public ResponseEntity<UserModel> registerUser(@RequestBody UserModel userBody) {
            return userService.registerUser(userBody);
        }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}


