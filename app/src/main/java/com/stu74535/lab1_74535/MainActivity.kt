package com.stu74535.lab1_74535

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.createBitmap
import com.stu74535.lab1_74535.ui.theme.Lab1_74535Theme
import org.w3c.dom.Text

val Black :  Color = Color.Black
val LightGray :  Color = Color.LightGray
val White :  Color = Color.White
val DarkGray :  Color = Color.DarkGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Lab1_74535Theme{

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    gLogin()
                }


            }
        }
    }
}



@Composable
fun gLogin(modifier: Modifier = Modifier.background(LightGray))
{


    Column(
        modifier
            .padding(start = 10.dp, top = 50.dp, end = 10.dp, bottom = 10.dp)
            .fillMaxHeight(), verticalArrangement = Arrangement.Top ) {
        Padlock(modifier = modifier
            .align(Alignment.CenterHorizontally)
            .padding(20.dp))

        TopMessage(message = "Welcome back you've been missed", modifier = modifier
            .align(Alignment.CenterHorizontally)
            .padding(15.dp), DarkGray)
        Email(modifier = modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(8))
            .background(White)
            .padding(15.dp)
            .fillMaxWidth(),
            DarkGray)

        Password(modifier = modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(8))
            .background(White)
            .padding(15.dp)

            .fillMaxWidth(), DarkGray)
        PasswordForgot(modifier = modifier.align(Alignment.End), DarkGray)
        Validation(modifier.fillMaxWidth(), message ="Log in", Black, White)
        MidMessage(modifier = modifier.align(Alignment.CenterHorizontally), DarkGray)
        Row(
            modifier
                .fillMaxWidth()
                .padding(10.dp), horizontalArrangement = Arrangement.Center) {
            Google(
                modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(20))
                    .background(White))



            Apple(
                modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(20))
                    .background(White))
        }
        MemberQuestion(modifier = modifier.padding(10.dp), Question = "Not a member?", Link = " Register now", DarkGray)

    }
}

@Composable
fun gSignUp(modifier: Modifier = Modifier.background(LightGray))
{


    Column(
        modifier
            .padding(start = 10.dp, top = 50.dp, end = 10.dp, bottom = 10.dp)
            .fillMaxHeight(), verticalArrangement = Arrangement.Bottom ) {
        Padlock(modifier = modifier
            .align(Alignment.CenterHorizontally)
            .padding(20.dp))

        TopMessage(message = "Let's create an account for you", modifier = modifier
            .align(Alignment.CenterHorizontally)
            .padding(10.dp), DarkGray)
        Email(
            modifier = modifier
                .padding(5.dp)
                .clip(RoundedCornerShape(8))
                .background(White)
                .padding(15.dp)
                .fillMaxWidth(),
            DarkGray)
        Password(modifier = modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(8))
            .background(White)
            .padding(15.dp)
            .fillMaxWidth(),
            DarkGray)
        ConfirmPassword(modifier = modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(8))
            .background(White)
            .padding(15.dp)
            .fillMaxWidth(),
            DarkGray)

        Validation(modifier.fillMaxWidth(), message ="Sign Up", Black, White)

        MemberQuestion(modifier = modifier.padding(30.dp), Question = "Already a Member?", Link = " Login now", DarkGray)

    }
}

@Composable
fun bLogin(modifier: Modifier = Modifier.background(Black))
{


    Column(
        modifier
            .padding(start = 10.dp, top = 50.dp, end = 10.dp, bottom = 10.dp)
            .fillMaxHeight(), verticalArrangement = Arrangement.Top ) {
        Padlock(modifier = modifier
            .align(Alignment.CenterHorizontally)
            .padding(20.dp))

        TopMessage(message = "Welcome back you've been missed", modifier = modifier.align(Alignment.CenterHorizontally), LightGray)
        Email(
            modifier
                .padding(5.dp)
                .clip(RoundedCornerShape(8))
                .background(DarkGray)
                .padding(15.dp)
                .fillMaxWidth()
                , LightGray)
        Password(modifier = modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(8))
            .background(DarkGray)
            .padding(15.dp)
            .fillMaxWidth()
            , LightGray)
        PasswordForgot(modifier = modifier.align(Alignment.End), LightGray)
        Validation(modifier.fillMaxWidth(), message ="Login", LightGray,DarkGray)
        MidMessage(modifier = modifier.align(Alignment.CenterHorizontally), LightGray)
        Row(
            modifier
                .fillMaxWidth()
                .padding(10.dp), horizontalArrangement = Arrangement.Absolute.Center) {
            Google(
                modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(20))
                    .background(DarkGray) )
            Apple(
                modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(20))
                    .background(DarkGray))
        }
        MemberQuestion(modifier = modifier.padding(10.dp), Question = "Not a member?", Link = " Register now", LightGray)

    }
}
@Preview(showBackground = true)
@Composable
fun bSignUp(modifier: Modifier = Modifier.background(Black))
{


    Column(
        modifier
            .padding(start = 10.dp, top = 50.dp, end = 10.dp, bottom = 10.dp)
            .fillMaxHeight(), verticalArrangement = Arrangement.Bottom ) {
        Padlock(modifier = modifier
            .align(Alignment.CenterHorizontally)
            .padding(20.dp))

        TopMessage(message = "Let's create an account for you", modifier = modifier
            .align(Alignment.CenterHorizontally)
            .padding(10.dp), LightGray)
        Email(
            modifier
                .padding(5.dp)
                .clip(RoundedCornerShape(8))
                .background(DarkGray)
                .padding(15.dp)
                .fillMaxWidth(), LightGray)
        Password(modifier = modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(8))
            .background(DarkGray)
            .padding(15.dp)
            .fillMaxWidth(), LightGray)
        ConfirmPassword(modifier = modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(8))
            .background(DarkGray)
            .padding(15.dp)
            .fillMaxWidth(), LightGray)

        Validation(
            modifier
                .padding(5.dp, 10.dp, 5.dp, 10.dp)
                .clip(RoundedCornerShape(10))
                .background(DarkGray)
                .padding(15.dp)
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally), message ="Sign Up", LightGray, DarkGray)

        MemberQuestion(modifier = modifier.padding(50.dp), Question = "Already a Member?", Link = " Login now", LightGray)

    }
}
@Composable
fun Email(modifier: Modifier, font: Color)
{
    Box{
        Text(text = "Email",modifier.align(Alignment.CenterStart) , fontSize = 16.sp, color = font)
    }
}
@Composable
fun Password(modifier: Modifier, font: Color )
{
    Box{
        Text(text = "Password",modifier.align(Alignment.CenterStart),fontSize = 16.sp, color = font)
    }
}
@Composable
fun ConfirmPassword(modifier: Modifier, font: Color )
{
    Box{
        Text(text = "Confirm password",modifier.align(Alignment.CenterStart) ,fontSize = 16.sp, color =font)
    }
}
@Composable
fun Padlock(modifier: Modifier)
{
    val padlock = painterResource(R.drawable.image_2024_03_14_012844831_removebg_preview)
    Box(modifier = modifier)
    {
        Image(painter = padlock, contentDescription = "Padlock logo" , modifier.size(150.dp))
    }
}

@Composable
fun Apple(modifier: Modifier)
{
    val apple = painterResource(R.drawable.png_clipart_apple_logo_apple_heart_logo_removebg_preview)
    Box(modifier){
        Image(painter = apple, contentDescription = "Apple logo",
            modifier
                .size(60.dp)
                .padding(15.dp))
    }
}

@Composable
fun Google(modifier: Modifier)
{
    val Google = painterResource(R.drawable.png_transparent_google_logo_google_text_trademark_logo_thumbnail_removebg_preview)
    Box(modifier = modifier)
    {
        Image(painter =Google, contentDescription = "Google logo" ,
            modifier
                .size(60.dp)
                .padding(15.dp))
    }
}

@Composable
fun TopMessage(message : String, modifier: Modifier, font : Color)
{
    Text(text = message, modifier, fontSize = 16.sp, color = font)
}
@Composable
fun PasswordForgot(modifier: Modifier, font : Color)
{
    Box(modifier) {
        Text(text = "Forgot Password?",modifier.padding(0.dp,0.dp,10.dp,10.dp), fontSize = 16.sp, color = font, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun Validation(modifier: Modifier, message: String, font: Color,ButtonColor: Color)
{
    Button(
        onClick = { /*TODO*/},
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
            .padding(horizontal = 10.dp, vertical = 20.dp),
        shape = RoundedCornerShape(15),
        colors = ButtonDefaults.buttonColors(
            containerColor = ButtonColor
        )
    ) {
        Text(
            text = message,
            color = font,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
@Composable
fun MidMessage(modifier: Modifier, font: Color)
{
    val graybar = painterResource(R.drawable.graybar_removebg_preview)
    Row(
        modifier
            .padding(10.dp)
            .fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Icon(painter = graybar, contentDescription = "Gray bar",
            modifier
                .size(100.dp, 5.dp)
                .align(Alignment.CenterVertically))
        Text("Or continue with", fontSize = 15.sp, color = font)
        Icon(painter = graybar, contentDescription = "Gray bar",
            modifier
                .size(100.dp, 5.dp)
                .align(Alignment.CenterVertically))
    }
}

@Composable
fun MemberQuestion(modifier: Modifier, Question : String, Link: String, font : Color)
{
    Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {

        TextButton(onClick = { /*TODO*/ }, border = BorderStroke(0.dp,Color.Transparent) ,contentPadding = PaddingValues(0.dp)) {
            Text(text = Question, fontSize = 15.sp, color = font)
            Text(text = Link, fontSize = 15.sp, fontWeight = FontWeight.Bold, color = font)
        }

    }
}