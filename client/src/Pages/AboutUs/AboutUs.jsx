import React from "react";

const AboutUs = () => {
  return (
    <div
      className="w-full h-screen bg-cover bg-center text-white flex flex-col justify-center items-center"
      style={{
        backgroundImage: `url('https://wallpapers.com/images/hd/silhouette-cameraman-sunset-b0bjt325vhjt1si2.jpg')`,
      }}
    >
      <div className="bg-black bg-opacity-50 p-10 rounded-xl max-w-3xl text-center">
        <h1 className="text-4xl font-bold mb-6">Welcome to Nightlife Photography</h1>
        <p className="text-lg">
        We are a team of photography enthusiasts and tech developers from the BSc (Hons) in Information Technology program at SLLIT. This project was born out of our passion for both technology and night photography.
        </p>
      </div>
    </div>
  );
};

export default AboutUs;
