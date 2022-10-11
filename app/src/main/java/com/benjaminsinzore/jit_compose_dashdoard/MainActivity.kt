package com.benjaminsinzore.jit_compose_dashdoard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.benjaminsinzore.jit_compose_dashdoard.ui.theme.Jit_compose_dashdoardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val scrollState = rememberScrollState()
            val painter = painterResource(id = R.drawable.img_4)
            val description = "Hello Benjamin, nice to meet you."
            val title = "Software Engineer."


            Jit_compose_dashdoardTheme {
                Column (
                    modifier = Modifier
                        .background(Color(0xffdcdcdc))
                        .fillMaxSize()

                        ) {

                    HeaderProfileComponent()
                    SearchBar()
//                    ShowBalance(painter = painter, contentDescription = description, title = title)

                    ImageCard(painter = painter, contentDescription = description,
                        scrollState = scrollState,
                        title = title)
                }

            }


        }
    }

    @Composable
    fun HeaderProfileComponent(){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp, end = 10.dp, top = 10.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically){

                Column(modifier = Modifier.padding(start = 5.dp, top = 1.dp)) {

                    Image(painter = painterResource(id = R.drawable.kyamuhunga_peoples_sacco),
                        contentDescription = "Profile Picture",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .height(50.dp)
                            .width(70.dp)
                            .clip(RoundedCornerShape(size = 5.dp))

                    )
                }

                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(
                        text = "Hello, Good evening",
                      fontSize = 25.sp,
                    textAlign = TextAlign.Start) //fontFamily =

                    Text(
                        text = "Benjamin Sinzore",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Start)
                }

            }

//            BadgedBox(badge = { Badge(backgroundColor = Color.Black)},
//                modifier = Modifier.padding(start = 5.dp, top = 5.dp)
//                ) {
//                Icon(
//                    Icons.Default.Notifications,
//                    contentDescription = "Notifications",
//                    modifier = Modifier
//                        .size(30.dp)
//                        .clickable { },
//                    Color.Black
//                )
//
//            }
        }

    }


    @Composable
    fun SearchBar(){
        OutlinedTextField(
            value = "",
            onValueChange = {},
            shape = RoundedCornerShape(8.dp),
            placeholder = { Text(text = " ")},
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 8.dp, top = 15.dp, bottom = 8.dp)
                .size(48.dp)
                .background(Color(0xffdcdcdc)),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.Black,
                cursorColor = Color.Black,
                trailingIconColor = Color.Black
            )

        )
    }

    @Composable
    fun ShortsVideo(){
        Row(

            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, top = 0.dp)
                .horizontalScroll(ScrollState(2))

        ) {

            Column(modifier = Modifier.padding(top = 10.dp, end = 5.dp)) {

                Image(painter = painterResource(id = R.drawable.benjmin_sinzore),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(40.dp)
                        .width(75.dp)
                        .clip(RoundedCornerShape(size = 8.dp))


                )
            }

            Column(modifier = Modifier.padding(top = 10.dp, end = 5.dp)) {

                Image(painter = painterResource(id = R.drawable.benjmin_sinzore),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(40.dp)
                        .width(75.dp)
                        .clip(RoundedCornerShape(size = 8.dp))


                )
            }

            Column(modifier = Modifier.padding(top = 10.dp, end = 5.dp)) {

                Image(painter = painterResource(id = R.drawable.benjmin_sinzore),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(40.dp)
                        .width(75.dp)
                        .clip(RoundedCornerShape(size = 8.dp))


                )
            }

            Column(modifier = Modifier.padding(top = 10.dp, end = 5.dp)) {

                Image(painter = painterResource(id = R.drawable.benjmin_sinzore),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(40.dp)
                        .width(75.dp)
                        .clip(RoundedCornerShape(size = 8.dp))


                )
            }

            Column(modifier = Modifier.padding(top = 10.dp, end = 5.dp)) {

                Image(painter = painterResource(id = R.drawable.benjmin_sinzore),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(40.dp)
                        .width(75.dp)
                        .clip(RoundedCornerShape(size = 8.dp))


                )
            }

            Column(modifier = Modifier.padding(top = 10.dp, end = 5.dp)) {

                Image(painter = painterResource(id = R.drawable.benjmin_sinzore),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(40.dp)
                        .width(75.dp)
                        .clip(RoundedCornerShape(size = 8.dp))


                )
            }

            Column(modifier = Modifier.padding(top = 10.dp, end = 5.dp)) {

                Image(painter = painterResource(id = R.drawable.benjmin_sinzore),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(40.dp)
                        .width(75.dp)
                        .clip(RoundedCornerShape(size = 8.dp))


                )
            }

            Column(modifier = Modifier.padding(top = 10.dp, end = 5.dp)) {

                Image(painter = painterResource(id = R.drawable.benjmin_sinzore),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(40.dp)
                        .width(75.dp)
                        .clip(RoundedCornerShape(size = 8.dp))


                )
            }


        }
    }

    @Composable
    fun ShowBalance(

        painter: Painter,
        contentDescription: String,
        title: String,
        modifier: Modifier = Modifier

    ){

        Row(
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, top = 10.dp)
                .verticalScroll(ScrollState(2))
            ) {

            Row() {
                Column() {

                    Row() {
                        Text(
                            text = "Account",
                            fontSize = 15.sp,
                            textAlign = TextAlign.Start)

                        Text(
                            text = "Statement",
                            fontSize = 15.sp,
                            textAlign = TextAlign.Start,
                        modifier = Modifier.padding(start = 8.dp))
                    }


                    Image(painter = painterResource(id = R.drawable.img_4),
                        contentDescription = "Profile Picture",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(180.dp)
                            .fillMaxWidth()
                            .padding(top = 5.dp)
                            .clip(RoundedCornerShape(size = 8.dp))


                    )
                }
            }

        }

    }

    @Composable
    fun ImageCard(
        painter: Painter,
        contentDescription: String,
        title: String,
        modifier: Modifier = Modifier,
        scrollState: ScrollState
    ) {

        Column(modifier = Modifier.verticalScroll(scrollState)) {

            Card(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 5.dp),
                shape = RoundedCornerShape(8.dp),
                elevation = 5.dp
            ) {
                Box(modifier = Modifier.height(200.dp)) {
                    Image(
                        painter = painter,
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp),
                        contentAlignment = Alignment.TopStart
                    ) {

                        Column() {
                            Text(title, style = TextStyle(color = Color.Black, fontSize = 16.sp))

                            Text(contentDescription, style = TextStyle(color = Color.Black, fontSize = 16.sp))
                        }

                    }
                }
            }

            Card(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 10.dp),
                shape = RoundedCornerShape(8.dp),
                elevation = 5.dp
            ) {
                Box(modifier = Modifier.height(200.dp)) {
                    Image(
                        painter = painter,
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp),
                        contentAlignment = Alignment.TopStart
                    ) {

                        Column() {
                            Text(title, style = TextStyle(color = Color.Black, fontSize = 16.sp))

                            Text(contentDescription, style = TextStyle(color = Color.Black, fontSize = 16.sp))
                        }

                    }
                }
            }

            Card(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 10.dp),
                shape = RoundedCornerShape(8.dp),
                elevation = 5.dp
            ) {
                Box(modifier = Modifier.height(200.dp)) {
                    Image(
                        painter = painter,
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp),
                        contentAlignment = Alignment.TopStart
                    ) {

                        Column() {
                            Text(title, style = TextStyle(color = Color.Black, fontSize = 16.sp))

                            Text(contentDescription, style = TextStyle(color = Color.Black, fontSize = 16.sp))
                        }

                    }
                }
            }
        }
    }

}


